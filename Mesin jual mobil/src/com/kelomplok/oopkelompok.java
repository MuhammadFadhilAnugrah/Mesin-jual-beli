package com.kelomplok;

public class oopkelompok {
    private String texbrand;
    private String textnamaMobil;
    private String JenisMesin;
    private String TipeBody;

    public oopkelompok() {
    }

    public oopkelompok(String texbrand, String textnamaMobil, String jenisMesin, String tipeBody) {
        this.texbrand = texbrand;
        this.textnamaMobil = textnamaMobil;
        JenisMesin = jenisMesin;
        TipeBody = tipeBody;
    }

    public String getTexbrand() {
        return texbrand;
    }

    public void setTexbrand(String texbrand) {
        this.texbrand = texbrand;
    }

    public String getTextnamaMobil() {
        return textnamaMobil;
    }

    public void setTextnamaMobil(String textnamaMobil) {
        this.textnamaMobil = textnamaMobil;
    }

    public String getJenisMesin() {
        return JenisMesin;
    }

    public void setJenisMesin(String jenisMesin) {
        JenisMesin = jenisMesin;
    }

    public String getTipeBody() {
        return TipeBody;
    }

    public void setTipeBody(String tipeBody) {
        TipeBody = tipeBody;
    }

}
