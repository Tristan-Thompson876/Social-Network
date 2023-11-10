package p1;

public class Content {
	// immutable instance data
	private String data;

	public Content(String data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return ""+this.data;
	}

}
