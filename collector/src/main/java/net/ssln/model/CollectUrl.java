package net.ssln.model;

import java.util.Date;

public class CollectUrl {
  private String id;
  private String detailUrl;
  private String netPicUrl;
  private String name;
  private int  state;
  private int type;
  private Date updateTime;
  private String collectDomain;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDetailUrl() {
	return detailUrl;
}
public void setDetailUrl(String detailUrl) {
	this.detailUrl = detailUrl;
}
public String getNetPicUrl() {
	return netPicUrl;
}
public void setNetPicUrl(String netPicUrl) {
	this.netPicUrl = netPicUrl;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
public Date getUpdateTime() {
	return updateTime;
}
public void setUpdateTime(Date updateTime) {
	this.updateTime = updateTime;
}
public String getCollectDomain() {
	return collectDomain;
}
public void setCollectDomain(String collectDomain) {
	this.collectDomain = collectDomain;
}
  
}
