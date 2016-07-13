package prob6;

public class Money {
	private int i;

	public Money(int i) {
		this.i=i;
	}
	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
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
		Money other = (Money) obj;
		if (i != other.i)
			return false;
		return true;
	}
	
	public Money add(Money num) {
		return  new Money(i+num.i);
	}
	public Money minus(Money num) {
		return  new Money(i-num.i);
	}
	public Money multiply(Money num) {
		return  new Money(i*num.i);
	}
	public Money devide(Money num) {
		return  new Money(i/num.i);
	}
	



	
	
	
	

	

}
