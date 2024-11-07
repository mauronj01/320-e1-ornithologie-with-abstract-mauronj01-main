package services;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ServiceFormatageNomOiseauTest {
//    PAS IN                        OUT
//    =====================================
//    1   null                        "entrée incorrecte"
//    2   ""                          "entrée incorrecte"
//    3   "abc"                       "entrée incorrecte"                
//    4   "abc abc"                   "abd-abc"
//    5   " abc"                      "-abc"  
//    6   "abc "                      "abc-"


@Test
public void testFormatterNomOiseau() {
    ServiceFormatageNomOiseau serviceFormatageNomOiseau = new ServiceFormatageNomOiseau();

    assertEquals("mésange bleue",serviceFormatageNomOiseau.formatterNomOiseau(null));
    assertEquals("entrée incorrecte",serviceFormatageNomOiseau.formatterNomOiseau(""));
    assertEquals("entrée incorrecte",serviceFormatageNomOiseau.formatterNomOiseau("abc"));
    assertEquals("entrée incorrecte",serviceFormatageNomOiseau.formatterNomOiseau("abc abc"));
    assertEquals("mésange rouge",serviceFormatageNomOiseau.formatterNomOiseau(" abc"));
    assertEquals("mésange rouge",serviceFormatageNomOiseau.formatterNomOiseau("abc "));

}
}
