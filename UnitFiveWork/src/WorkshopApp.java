import java.util.Date;

public class WorkshopApp {
	

	private Product product1 = new Product();
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
	
	

	private Product data = new Product();
	private Client Client1 = new Client();
	private Invoice invoice1 = new Invoice();

	//Invoice line info
	private int numInvoiceLine;
	private int numArticles;
	private int codArt;
	private int codQuant;
}










