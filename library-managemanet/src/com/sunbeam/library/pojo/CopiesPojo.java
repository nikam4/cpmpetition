package com.sunbeam.library.pojo;

public class CopiesPojo {
	
	private  int id ;
	private   int bookid ;
	private int  rack ;
	private String status ;
	
	public CopiesPojo(int id, int bookid, int rack, String status) {
		super();
		this.id = id;
		this.bookid = bookid;
		this.rack = rack;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getRack() {
		return rack;
	}

	public void setRack(int rack) {
		this.rack = rack;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookid;
		result = prime * result + id;
		result = prime * result + rack;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CopiesPojo other = (CopiesPojo) obj;
		if (bookid != other.bookid)
			return false;
		if (id != other.id)
			return false;
		if (rack != other.rack)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CopiesPojo [id=" + id + ", bookid=" + bookid + ", rack=" + rack + ", status=" + status + "]";
	}
	
	

}
