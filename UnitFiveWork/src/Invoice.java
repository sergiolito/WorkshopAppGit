import java.sql.Date;

public class Invoice {
	private int codInvoice;
	private Date dateInvoice;
	private double sum;
	private int discount;

	public Invoice() {
	}

	public int getCodInvoice() {
		return codInvoice;
	}

	public void setCodInvoice(int codInvoice) {
		this.codInvoice = codInvoice;
	}

	public Date getDateInvoice() {
		return dateInvoice;
	}

	public void setDateInvoice(Date dateInvoice) {
		this.dateInvoice = dateInvoice;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}