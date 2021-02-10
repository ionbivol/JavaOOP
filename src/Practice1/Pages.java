package Practice1;

public class Pages {

    private int noOfPages;
    private String contend;

    public Pages(int noOfPages, String contend) {
        this.noOfPages = noOfPages;
        this.contend = contend;
    }

    public String getContend() {
        return contend;
    }

    public void setContend(String contend) {
        this.contend = contend;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    @Override
    public String toString() {
        return "Pages{" +
                "noOfPages=" + noOfPages +
                ", contend='" + contend + '\'' +
                '}';
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
}

