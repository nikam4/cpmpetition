package com.sunbeam.library.pojo;

public class IssueRecoardPojo {
	
	private  int id ;
	private int copyid ;
	private int memberid ;
	private String issue_date ;
	private String return_duedate ;
	private String return_date ;
	private int fine_amount ;
	
	public IssueRecoardPojo(int id, int copyid, int memberid, String issue_date, String return_duedate,
			String return_date, int fine_amount) {
		super();
		this.id = id;
		this.copyid = copyid;
		this.memberid = memberid;
		this.issue_date = issue_date;
		this.return_duedate = return_duedate;
		this.return_date = return_date;
		this.fine_amount = fine_amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCopyid() {
		return copyid;
	}

	public void setCopyid(int copyid) {
		this.copyid = copyid;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}

	public String getReturn_duedate() {
		return return_duedate;
	}

	public void setReturn_duedate(String return_duedate) {
		this.return_duedate = return_duedate;
	}

	public String getReturn_date() {
		return return_date;
	}

	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}

	public int getFine_amount() {
		return fine_amount;
	}

	public void setFine_amount(int fine_amount) {
		this.fine_amount = fine_amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + copyid;
		result = prime * result + fine_amount;
		result = prime * result + id;
		result = prime * result + ((issue_date == null) ? 0 : issue_date.hashCode());
		result = prime * result + memberid;
		result = prime * result + ((return_date == null) ? 0 : return_date.hashCode());
		result = prime * result + ((return_duedate == null) ? 0 : return_duedate.hashCode());
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
		IssueRecoardPojo other = (IssueRecoardPojo) obj;
		if (copyid != other.copyid)
			return false;
		if (fine_amount != other.fine_amount)
			return false;
		if (id != other.id)
			return false;
		if (issue_date == null) {
			if (other.issue_date != null)
				return false;
		} else if (!issue_date.equals(other.issue_date))
			return false;
		if (memberid != other.memberid)
			return false;
		if (return_date == null) {
			if (other.return_date != null)
				return false;
		} else if (!return_date.equals(other.return_date))
			return false;
		if (return_duedate == null) {
			if (other.return_duedate != null)
				return false;
		} else if (!return_duedate.equals(other.return_duedate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IssueRecoardPojo [id=" + id + ", copyid=" + copyid + ", memberid=" + memberid + ", issue_date="
				+ issue_date + ", return_duedate=" + return_duedate + ", return_date=" + return_date + ", fine_amount="
				+ fine_amount + "]";
	}
	
	
	
	}
