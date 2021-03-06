package com.github.ka4ok85.wca.response;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.ka4ok85.wca.response.containers.EngageList;

@Component
@Scope("prototype")
public class GetListsResponse extends AbstractResponse {

	private List<EngageList> lists;

	public List<EngageList> getLists() {
		return lists;
	}

	public void setLists(List<EngageList> lists) {
		this.lists = lists;
	}

	@Override
	public String toString() {
		return "GetListsResponse [lists=" + lists + "]";
	}

}
