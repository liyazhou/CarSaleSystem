package com.bmw.sale.value;

// Generated 2013-6-20 22:54:03 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Service generated by hbm2java
 */
public class Service implements java.io.Serializable {

	private Integer serid;
	private Client client;
	private Date serdate;
	private String serstate;

	public Service() {
	}

	public Service(Date serdate, String serstate) {
		this.serdate = serdate;
		this.serstate = serstate;
	}

	public Service(Client client, Date serdate, String serstate) {
		this.client = client;
		this.serdate = serdate;
		this.serstate = serstate;
	}

	public Integer getSerid() {
		return this.serid;
	}

	public void setSerid(Integer serid) {
		this.serid = serid;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getSerdate() {
		return this.serdate;
	}

	public void setSerdate(Date serdate) {
		this.serdate = serdate;
	}

	public String getSerstate() {
		return this.serstate;
	}

	public void setSerstate(String serstate) {
		this.serstate = serstate;
	}

}
