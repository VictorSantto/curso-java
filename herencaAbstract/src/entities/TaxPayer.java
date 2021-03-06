package entities;

public abstract class TaxPayer {
	
	private String name;
	private Double anaualIncome;
	
	public TaxPayer() {
	}

	public TaxPayer(String name, Double anaualIncome) {
		super();
		this.name = name;
		this.anaualIncome = anaualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnaualIncome() {
		return anaualIncome;
	}

	public void setAnaualIncome(Double anaualIncome) {
		this.anaualIncome = anaualIncome;
	}
	
	public abstract double tax();
}
