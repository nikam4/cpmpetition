package com.sunbeam.library.pojo;

public class PaymentPojo
{

	
	private  int id ;
	private int  userid ;
	private int   amount ;
	private String type ;
	private String transaction_time ;
	private String nextpayment_duedate ;
	
	
	public PaymentPojo(int id, int userid, int amount, String type, String transaction_time,
			String nextpayment_duedate) {
		super();
		this.id = id;
		this.userid = userid;
		this.amount = amount;
		this.type = type;
		this.transaction_time = transaction_time;
		this.nextpayment_duedate = nextpayment_duedate;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTransaction_time() {
		return transaction_time;
	}
	public void setTransaction_time(String transaction_time) {
		this.transaction_time = transaction_time;
	}
	public String getNextpayment_duedate() {
		return nextpayment_duedate;
	}
	public void setNextpayment_duedate(String nextpayment_duedate) {
		this.nextpayment_duedate = nextpayment_duedate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + id;
		result = prime * result + ((nextpayment_duedate == null) ? 0 : nextpayment_duedate.hashCode());
		result = prime * result + ((transaction_time == null) ? 0 : transaction_time.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + userid;
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
		PaymentPojo other = (PaymentPojo) obj;
		if (amount != other.amount)
			return false;
		if (id != other.id)
			return false;
		if (nextpayment_duedate == null) {
			if (other.nextpayment_duedate != null)
				return false;
		} else if (!nextpayment_duedate.equals(other.nextpayment_duedate))
			return false;
		if (transaction_time == null) {
			if (other.transaction_time != null)
				return false;
		} else if (!transaction_time.equals(other.transaction_time))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (userid != other.userid)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "PaymentPojo [id=" + id + ", userid=" + userid + ", amount=" + amount + ", type=" + type
				+ ", transaction_time=" + transaction_time + ", nextpayment_duedate=" + nextpayment_duedate + "]";
	}
	
	
	
}
