package gov.usgs.wma.gcmrc.model;

import java.time.ZonedDateTime;

/**
 * Specifies how a site should be/loaded and stored from Aquarius and in GDAWS
 * 
 * Unique instances are ID'ed in the database by the combo of localSiteId and
 * localParamId.
 * 
 * @author thongsav
 */
public class SiteConfiguration {
	private Long localSiteId;		//One part (of 2) of the db identifier
	private Integer localParamId;	//One part (of 2) of the db identifier
	private String remoteSiteId;
	private String pCode;
	private String aqParam;
	private ZonedDateTime lastNewPullStart;
	private ZonedDateTime lastNewPullEnd;
	
	public SiteConfiguration() {
		//empty for MyBatis
	}
	
	/**
	 * Full constructor.
	 * @param localSiteId
	 * @param localParamId
	 * @param remoteSiteId
	 * @param pCode
	 * @param lastNewPullStart
	 * @param lastNewPullEnd
	 * @param aqParam 
	 */
	public SiteConfiguration(Long localSiteId, Integer localParamId, String remoteSiteId, String pCode, ZonedDateTime lastNewPullStart, ZonedDateTime lastNewPullEnd, String aqParam) {
		this.pCode = pCode;
		this.remoteSiteId = remoteSiteId;
		this.localSiteId = localSiteId;
		this.localParamId = localParamId;
		this.aqParam = aqParam;
		this.lastNewPullStart = lastNewPullStart;
		this.lastNewPullEnd = lastNewPullEnd;
	}
	
	public Long getLocalSiteId() {
		return localSiteId;
	}
	public void setLocalSiteId(Long siteId) {
		this.localSiteId = siteId;
	}
	
	public Integer getLocalParamId() {
		return localParamId;
	}
	public void setLocalParamId(Integer groupId) {
		this.localParamId = groupId;
	}
	
	public String getPCode() {
		return pCode;
	}
	public void setPCode(String parameter) {
		this.pCode = parameter;
	}
	public String getRemoteSiteId() {
		return remoteSiteId;
	}
	public void setRemoteSiteId(String siteNumber) {
		this.remoteSiteId = siteNumber;
	}

	public String getAqParam() {
		return aqParam;
	}

	public void setAqParam(String aqParam) {
		this.aqParam = aqParam;
	}

	public ZonedDateTime getLastNewPullStart() {
		return lastNewPullStart;
	}

	public void setLastNewPullStart(ZonedDateTime lastNewPullStart) {
		this.lastNewPullStart = lastNewPullStart;
	}

	public ZonedDateTime getLastNewPullEnd() {
		return lastNewPullEnd;
	}

	public void setLastNewPullEnd(ZonedDateTime lastNewPullEnd) {
		this.lastNewPullEnd = lastNewPullEnd;
	}
	
	
}