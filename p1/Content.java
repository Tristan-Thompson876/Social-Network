package p1;

public class Content {
    private String data;

    public Content(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Content{" +
               "data='" + data + '\'' +
               '}';
    }
}
