public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkats = new Perangkat("hp", 7, 3.3f);
        perangkats.informasi();

        System.out.println();

        Handphone hp = new Handphone(false, "sunscreen", 8, 2.2f);
        hp.informasi();
        hp.telfon(858834);
        hp.kirimSMS(25883);
        hp.sendMultiMessage(12345, 5789);

        System.out.println();

        Laptop laptop = new Laptop("Seal", 16, 3.2f, false);
        laptop.informasi();
        laptop.bukaGame("MobileLegend");
        laptop.kirimEmail("nanazimtyaz@gmail.com");
        laptop.multiEmail("nanazimtyaz@mail.com", "nanazimtyaz@mail.com");
    }
}