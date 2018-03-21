import java.sql.Date;

public class WorkshopApp {
	
	private Product data = new Product();
	//Client info
	private int codCli;
	private String cliDNI;
	private String cliName;
	private String cliFirstName;
	
	
	
	//Invoice info
	private int codInvoice;
	private Date dateInvoice;
	private double sum;
	private int discount;
	
	
	//Invoice line info
	private int numInvoiceLine;
	private int numArticles;
	private int codArt;
	private int codQuant;
}










