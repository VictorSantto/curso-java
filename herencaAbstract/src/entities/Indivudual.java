package entities;

public class Indivudual extends TaxPayer {

	private Double healthExpenditures;
	
	public Indivudual() {
	}
	
	public Indivudual(String name, Double anaualIncome, Double healthExpenditures) {
		super(name, anaualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {

		double basicTax = (getAnaualIncome() < 20000.0) ? getAnaualIncome() * 0.15 : getAnaualIncome() * 0.25;
		
//		double basicTax;
//		
//		if (getAnaualIncome() < 20000.0) {
//			basicTax = getAnaualIncome() * 0.15;
//		}
//		else {
//			basicTax = getAnaualIncome() * 0.25;
//		}
		
		basicTax -= getHealthExpenditures() * 0.5;
		if (basicTax < 0.0) {
			basicTax = 0.0;
		}
		else {
			return basicTax;
		}
		
		return basicTax;
	}
}
