package kadai30;

public class FortuneBean {

	private String month;
	private String color;
	private String item;
	private int rank;

	public FortuneBean() {

	}

	public FortuneBean(String month, String color, String item, int rank) {
		this.month = month;
		this.item = item;
		this.color = color;
		this.rank = rank;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}
