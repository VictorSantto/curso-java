package entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployees;
	
	public Company() {
	}
	
	public Company(String name, Double anaualIncome, Integer numberOfEmployees) {
		super(name, anaualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if (numberOfEmployees > 10) {
			return getAnaualIncome() * 0.14;
		}
		else {
			return getAnaualIncome() * 0.16;
		}
	}
}
