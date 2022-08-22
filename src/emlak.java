import sun.lwawt.macosx.CSystemTray;

public class emlak {

    String ilanbasligiinput = "Test Emlak İlan";
    String ilanaciklamasiinput= "Her aileye uygun temiz daire tabii ki SAHİBİNDEN :) ";
    int odasayisiinput = 3 + 1;
    int alanm2input = 150;
    int katinput = 10;
    String siteicerisindemiinput = "evet";
    int banyosayisiinput = 2;
    String sehirinput = "istanbul";
    String ilceinput = "Büyükçekmece";
    String sahibindenmiinput = "Hayır";

     public  void ilanbasliği()
{
    System.out.println("ilan başlığınız :" + ilanbasligiinput);
}
     public  void ilanAciklamasi()
{
    System.out.println("ilan Açıklamanız: "+ ilanaciklamasiinput);
}

    public void odaSayisi(){

    System.out.println("oda sayınız: " + odasayisiinput);
}

    public void alan(){

    System.out.println("Alan m2 : "+ alanm2input);
}

     public void kat(){

        System.out.println("Kat : "+ katinput);
    }

    public void siteİcerisiMi(){

        System.out.println("Site içierisinde mi ? : "+ siteicerisindemiinput);
    }
    public void banyoSayisi(){

        System.out.println("Banyo sayınız : "+ banyosayisiinput);
    }
    public void sehir(){

        System.out.println("Şehir : "+ sehirinput);
    }

    public void İlce(){

        System.out.println("İlçe : "+ ilceinput);
    }
     public  void SahibindenMi(){

    System.out.println("sahibinden mi ?: " + sahibindenmiinput);

}


    }

