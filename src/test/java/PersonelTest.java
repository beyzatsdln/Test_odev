import org.example.Personel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonelTest {
    @Test

    public void testmaashesap() {
        Personel personel = new Personel("Beyza Tasdelen", 26, 2000);
        int expectedmaas = (2000*25)+ (1000*1);
        Assert.assertEquals(personel.maasHesapla(), expectedmaas, "Maas hesaplaması hatalı");

    }

    @DataProvider(name= "PersonelVerileri")

    public Object[] createData() {
        return new Object [][]{
                {"Beyza Tasdelen", 26, 2000, (2000 * 25) + (1000 * 1)},
                {"Aslı Tok", 24, 2500, (2500 * 24)},
                {"Mehmet Ali", 30, 3000, (3000 * 25) + (1000 * 5)}
        };

    }

    @Test(dataProvider =  "PersonelVerileri")

    public void testmaashesapDataProvider(String personelAdi, int calistigiGunSayisi, int gunlukUcret, int expectedmaas){
        Personel personel = new Personel(personelAdi, calistigiGunSayisi, gunlukUcret);
        Assert.assertEquals(personel.maasHesapla(), expectedmaas, "Maashesaplamasıhatalı");
    }

}
