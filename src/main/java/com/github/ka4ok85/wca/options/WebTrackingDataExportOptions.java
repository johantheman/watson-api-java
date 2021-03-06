package com.github.ka4ok85.wca.options;

import java.time.LocalDateTime;
import java.util.List;

import com.github.ka4ok85.wca.constants.ExportFormatWebTrackingDataExport;
import com.github.ka4ok85.wca.constants.FileEncoding;

public class WebTrackingDataExportOptions extends AbstractOptions {

	private LocalDateTime eventStartDate;
	private LocalDateTime eventEndDate;
	private List<Long> domains;
	private List<Long> sites;
	private Long databaseId;
	private ExportFormatWebTrackingDataExport exportFormat = ExportFormatWebTrackingDataExport.CSV;
	private String exportFileName;
	private FileEncoding fileEncoding = FileEncoding.UTF_8;
	private boolean moveToFTP = true;

	private boolean allEventTypes = true;
	private boolean eventSiteVisit = false;
	private boolean eventPageView = false;
	private boolean eventClick = false;
	private boolean eventFormSubmit = false;
	private boolean eventDownload = false;
	private boolean eventMedia = false;
	private boolean eventShareToSocial = false;
	private boolean eventCustom = false;

	private List<String> columns;
	private String localAbsoluteFilePath;

	public LocalDateTime getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(LocalDateTime eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public LocalDateTime getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(LocalDateTime eventEndDate) {
		this.eventEndDate = eventEndDate;
	}

	public List<Long> getDomains() {
		return domains;
	}

	public void setDomains(List<Long> domains) {
		this.domains = domains;
	}

	public List<Long> getSites() {
		return sites;
	}

	public void setSites(List<Long> sites) {
		this.sites = sites;
	}

	public Long getDatabaseId() {
		return databaseId;
	}

	public void setDatabaseId(Long databaseId) {
		if (databaseId == null || databaseId < 1) {
			throw new RuntimeException("Database ID must be greater than zero. Provided Database ID = " + databaseId);
		}

		this.databaseId = databaseId;
	}

	public ExportFormatWebTrackingDataExport getExportFormat() {
		return exportFormat;
	}

	public void setExportFormat(ExportFormatWebTrackingDataExport exportFormat) {
		this.exportFormat = exportFormat;
	}

	public String getExportFileName() {
		return exportFileName;
	}

	public void setExportFileName(String exportFileName) {
		if (exportFileName == null || exportFileName.isEmpty()) {
			throw new RuntimeException("Export File Name must not be empty.");
		}

		this.exportFileName = exportFileName;
	}

	public FileEncoding getFileEncoding() {
		return fileEncoding;
	}

	public void setFileEncoding(FileEncoding fileEncoding) {
		this.fileEncoding = fileEncoding;
	}

	public boolean isMoveToFTP() {
		return moveToFTP;
	}

	public void setMoveToFTP(boolean moveToFTP) {
		this.moveToFTP = moveToFTP;
	}

	public boolean isAllEventTypes() {
		return allEventTypes;
	}

	public void setAllEventTypes(boolean allEventTypes) {
		this.allEventTypes = allEventTypes;
	}

	public boolean isEventSiteVisit() {
		return eventSiteVisit;
	}

	public void setEventSiteVisit(boolean eventSiteVisit) {
		if (eventSiteVisit == true) {
			allEventTypes = false;
		}

		this.eventSiteVisit = eventSiteVisit;
	}

	public boolean isEventPageView() {
		return eventPageView;
	}

	public void setEventPageView(boolean eventPageView) {
		if (eventPageView == true) {
			allEventTypes = false;
		}

		this.eventPageView = eventPageView;
	}

	public boolean isEventClick() {
		return eventClick;
	}

	public void setEventClick(boolean eventClick) {
		if (eventClick == true) {
			allEventTypes = false;
		}

		this.eventClick = eventClick;
	}

	public boolean isEventFormSubmit() {
		return eventFormSubmit;
	}

	public void setEventFormSubmit(boolean eventFormSubmit) {
		if (eventFormSubmit == true) {
			allEventTypes = false;
		}

		this.eventFormSubmit = eventFormSubmit;
	}

	public boolean isEventDownload() {
		return eventDownload;
	}

	public void setEventDownload(boolean eventDownload) {
		if (eventDownload == true) {
			allEventTypes = false;
		}

		this.eventDownload = eventDownload;
	}

	public boolean isEventMedia() {
		return eventMedia;
	}

	public void setEventMedia(boolean eventMedia) {
		if (eventMedia == true) {
			allEventTypes = false;
		}

		this.eventMedia = eventMedia;
	}

	public boolean isEventShareToSocial() {
		return eventShareToSocial;
	}

	public void setEventShareToSocial(boolean eventShareToSocial) {
		if (eventShareToSocial == true) {
			allEventTypes = false;
		}

		this.eventShareToSocial = eventShareToSocial;
	}

	public boolean isEventCustom() {
		return eventCustom;
	}

	public void setEventCustom(boolean eventCustom) {
		if (eventCustom == true) {
			allEventTypes = false;
		}

		this.eventCustom = eventCustom;
	}

	public List<String> getColumns() {
		return columns;
	}

	public void setColumns(List<String> columns) {
		this.columns = columns;
	}

	public String getLocalAbsoluteFilePath() {
		return localAbsoluteFilePath;
	}

	public void setLocalAbsoluteFilePath(String localAbsoluteFilePath) {
		this.localAbsoluteFilePath = localAbsoluteFilePath;
	}

	@Override
	public String toString() {
		return "WebTrackingDataExportOptions [eventStartDate=" + eventStartDate + ", eventEndDate=" + eventEndDate
				+ ", domains=" + domains + ", sites=" + sites + ", databaseId=" + databaseId + ", exportFormat="
				+ exportFormat + ", exportFileName=" + exportFileName + ", fileEncoding=" + fileEncoding
				+ ", moveToFTP=" + moveToFTP + ", allEventTypes=" + allEventTypes + ", eventSiteVisit=" + eventSiteVisit
				+ ", eventPageView=" + eventPageView + ", eventClick=" + eventClick + ", eventFormSubmit="
				+ eventFormSubmit + ", eventDownload=" + eventDownload + ", eventMedia=" + eventMedia
				+ ", eventShareToSocial=" + eventShareToSocial + ", eventCustom=" + eventCustom + ", columns=" + columns
				+ ", localAbsoluteFilePath=" + localAbsoluteFilePath + "]";
	}

}
