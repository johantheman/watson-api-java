package com.github.ka4ok85.wca.response;

public class RawRecipientDataExportResponse extends AbstractResponse {

	private String remoteFileName;

	public String getRemoteFileName() {
		return remoteFileName;
	}

	public void setRemoteFileName(String remoteFileName) {
		this.remoteFileName = remoteFileName;
	}

	@Override
	public String toString() {
		return "RawRecipientDataExportResponse [remoteFileName=" + remoteFileName + "]";
	}

}
