package com.modul5.auliaravi.auliaravi_1202150037_modul5;


// ini adalah model untuk recycler view  yang gunannya nanti di hubungkan dengan adapter
public class ListItem {
    private String todo, desc, prior;

    //  Konstruktor dari variabel yang sudah di deklarasi
    public ListItem(String todo, String desc, String prior) {
        this.todo = todo;
        this.desc = desc;
        this.prior = prior;
    }
    // Method setter getter untuk mengatur dan mendapatkan nilai dari variabel yang sudah di deklarasikan
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrior() {
        return prior;
    }

    public void setPrior(String prior) {
        this.prior = prior;
    }
}
