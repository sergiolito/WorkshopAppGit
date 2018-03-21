
public class Product {
	private int codProd;
	private String prodDescripion;
	private double prodPrice;
	private int prodStock;

	public Product() {
	}

	public int getCodProd() {
		return codProd;
	}

	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}

	public String getProdDescripion() {
		return prodDescripion;
	}

	public void setProdDescripion(String prodDescripion) {
		this.prodDescripion = prodDescripion;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	public int getProdStock() {
		return prodStock;
	}

	public void setProdStock(int prodStock) {
		this.prodStock = prodStock;
	}
}