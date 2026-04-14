package testing;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import modele.Cerere;
import modele.Donator;
import modele.TipCaz;
import modele.TipCerere;

class DonatorTest {
	@Test
	void testIntroducereDate() {
		String inputSimulat = "Ionescu\nAndrei\nRO99BANC123\n4500\n";
        System.setIn(new ByteArrayInputStream(inputSimulat.getBytes()));

        Donator d = new Donator();
        Donator donatorRezultat = d.IntroducereDate();

        assertNotNull(donatorRezultat, "Obiectul Donator nu ar trebui să fie null");
        
 
        assertEquals("Ionescu", donatorRezultat.getNume());
        assertEquals("Andrei", donatorRezultat.getPrenume());
        assertEquals("RO99BANC123", donatorRezultat.getIBAN());
        assertEquals(4500, donatorRezultat.getVenit());
	}


	@Test
	void testAlegeCaz() {
		Donator donator = new Donator("Popescu", "Ion", "RO1234", 5000);
        List<Cerere> cereri = new ArrayList<>();
   
        TipCaz primaCategorie = TipCaz.values()[0];
        cereri.add(new Cerere(1200,"George",TipCerere.Aprobata, 
                103, "Ajutor pentru tratament",primaCategorie));


        String dateIntrare = "0\n0\n100\n";
        System.setIn(new ByteArrayInputStream(dateIntrare.getBytes()));

        donator.alegeCaz(cereri);

        System.out.println("Exit");
		
		
	}

}
