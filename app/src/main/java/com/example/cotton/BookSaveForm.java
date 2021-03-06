package com.example.cotton;

public class BookSaveForm {
    private String pictureLink;
    private String major;
    private String bookName;
    private String bookWriter;
    private String barcode;
    //private String walletInfo;
    //private String userName;


    public BookSaveForm(){}
    public BookSaveForm(String pictureLink, String major, String bookName, String bookWriter, String barcode/*, String userName*/){
        this.pictureLink = pictureLink;
        this.major = major;
        this.bookName = bookName;
        this.bookWriter = bookWriter;
        this.barcode = barcode;
        //this.walletInfo = walletInfo;
        //this.userName = userName;
    }

    public String getPictureLink() {
        return pictureLink;
    }

    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookWriter() {
        return bookWriter;
    }

    public void setBookWriter(String bookWriter) {
        this.bookWriter = bookWriter;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
