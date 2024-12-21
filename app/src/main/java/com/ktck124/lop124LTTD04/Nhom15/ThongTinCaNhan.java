package com.ktck124.lop124LTTD04.Nhom15;

public class ThongTinCaNhan {
    private String Ten;
    private String MSV;

    public ThongTinCaNhan(String ten, String MSV) {
        Ten = ten;
        this.MSV = MSV;
    }

    public ThongTinCaNhan() {
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }
}
