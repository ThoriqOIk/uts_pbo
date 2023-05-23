package coba ;

public class mahasiswa{
    private String nama = "thoriq";
    private int NIM ;
    private String jeniskelamin ;
    public String getnama(){
       return nama; 
    }
    public int getNIM(){
        return NIM;
    }
    public void set(String namain){
        nama = namain;
    }
    public void set(int NIMin){
        NIM = NIMin;
    }
    public void setjeniskelamin(String jkin){
        jeniskelamin = jkin;
    }
    public String getjeniskelamin(){
        return jeniskelamin;
    }
    public void tampilkandata(){
        System.out.println("Nama : "+ getnama());
        System.out.println("NIM : "+ getNIM());
        System.out.println("Jeniskelamin : "+ getjeniskelamin());
        
    }
    public void inputdata(String m, int n, String b){
        set(m);
        set(n);
        setjeniskelamin(b);

    }
}