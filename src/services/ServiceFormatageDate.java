package services;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;

public class ServiceFormatageDate {

   



/**
     * Formate une date selon avec le style FULL de la locale par défaut. 
     * Pour la Suisse romande, le résultat sera par exemple jeudi 5 septembre 2024 
     * 
     * @param date la date de type LocalDate
     * 
     * @return la date formatée
     */
    public String formaterDate(LocalDate date) {
        Locale locale = new Locale.Builder().setLanguage("fr").setRegion("CH").build();
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
        SimpleDateFormat form = new SimpleDateFormat("EEEE, MMMM dd, yyyy", dateFormatSymbols);
        String formattedDate = form.format(date);
        return formattedDate;
        

    }
}
