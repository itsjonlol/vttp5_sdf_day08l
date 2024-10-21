package day08;


import java.util.Date;

public class Product {
    private long id;
    private String prodName;
    private String prodDesc;
    private String prodCategory;
    private Date createdDate;
    private Float price;

    
    

    public Product(String prodName, String prodDesc, String prodCategory, Float price) {
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodCategory = prodCategory;
        this.price = price;
    }




    



    public Product(long id, String prodName, String prodDesc, String prodCategory, Date createdDate, Float price) {
        this.id = id;
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodCategory = prodCategory;
        this.createdDate = createdDate;
        this.price = price;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public String getProdCategory() {
        return prodCategory;
    }

    public void setProdCategory(String prodCategory) {
        this.prodCategory = prodCategory;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", prodName=" + prodName + ", prodDesc=" + prodDesc + ", prodCategory="
                + prodCategory + ", createdDate=" + createdDate + ", price=" + price + ", getId()=" + getId()
                + ", getProdName()=" + getProdName() + ", getProdDesc()=" + getProdDesc() + ", getProdCategory()="
                + getProdCategory() + ", getCreatedDate()=" + getCreatedDate() + ", getPrice()=" + getPrice()
                + ", getClass()=" + getClass() + "]";
    }

    
    
    

    
    
    


}