class Item{
    private String title;
    private int id;
    private boolean isAvailable;

    Item(String title)
    {
        this.title = title;
        isAvailable = true;
    }

    Item(String title, int id)
    {
        this.title = title;
        this.id = id;
        isAvailable = true;
    }

    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
 
}
class Book extends Item{
    private int qty;
    private String author;

    Book(String title,int id,  String author, int qty) {
        super(title,id);
        this.qty = qty;
        this.author = author;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
}

class Magazine extends Item{
    private int vol;
    private int issueNo;
    Magazine(String title,int id, int vol, int issueNo) {
        super(title,id );
        this.vol = vol;
        this.issueNo = issueNo;
    }
    public int getVol() {
        return vol;
    }
    public void setVol(int vol) {
        this.vol = vol;
    }
    public int getIssueNo() {
        return issueNo;
    }
    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }
    
}
