public class MainApp {
    public static void main(String[] args) throws Exception {
    TransportasiAir objTransportasiAir = new TransportasiAir (4,200);
    objTransportasiAir.informasi();
    objTransportasiAir.berlayar();
    objTransportasiAir.berlabuh();
    System.out.println();

    Sampan objSampan = new Sampan(20, 50000, 2);
        objSampan.informasi();
        objSampan.berlayar();
        objSampan.berlabuh();
        objSampan.berlabuh(2);
        System.out.println();
        
        Kapal objKapal = new Kapal(50,10000, "Diesel");
        objKapal.informasi();
        objKapal.berlayar();
        objKapal.berlayar(20);
        objKapal.berlabuh();
    }
}