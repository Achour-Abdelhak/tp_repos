/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsejson;

import entite.Lot;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import inputOutputFile.FileReader;
import entite.Terrain;
import java.util.regex.*;
/**
 *
 * @author achab
 */
public class ManipTerrain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException {
        String myJson;
        JSONObject singleLot ;
        
        myJson = inputOutputFile.FileReader.loadFileIntoSttring("json/terrain.json");
        JSONObject terrain = JSONObject.fromObject(myJson);
        
        int typeTerrain = terrain.getInt("type_terrain");
        String prixMin= terrain.getString("prix_m2_min");
        String prixMax= terrain.getString("prix_m2_max");
        
      Pattern pattern;
      Matcher matcher;
       // pattern = Pattern.compile("[0-9]+\\.[0-9]\\$");
        pattern = Pattern.compile("[0-9]+\\.[0-9]\\$");
        matcher = pattern.matcher(prixMin);
        if(matcher.find()) {
            System.out.println("motif trouvé");
        }
        else {
            System.out.println("motif non trouvé");
        }
        
        JSONArray listeLots= terrain.getJSONArray("lotissements");
        
        Terrain ter = new Terrain();
        Lot unLot = null;
        
        ter.setType_Terrain(typeTerrain);
        ter.setPrix_m2_min(extractPrice(prixMin));
        ter.setPrix_m2_max(extractPrice(prixMax));
        for(int i=0;i< listeLots.size();i++)
        {  unLot = new Lot(typeTerrain);
           singleLot = listeLots.getJSONObject(i);
           unLot.setDescription(singleLot.getString("description"));
           unLot.setNombre_droits_passage(singleLot.getInt("nombre_droits_passage"));
           unLot.setNombre_services(singleLot.getInt("nombre_services"));
           unLot.setSuperficie(singleLot.getDouble("superficie"));
           ter.getLotissement().add(unLot);
           
           singleLot.clear();
            
        }
        for( Lot tmp:ter.getLotissement())
        {
            System.out.println(tmp.toString());
        
        }
        
//// SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); MARCHE AUSSI
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy",Locale.FRANCE);
//        //  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH); SI LE FORMAT DE LA DATE EST ANGLAIS ET MON LOCAL PAR DEFAUT EST FRENSH
//        Date date = formatter.parse(dateEmbahche);
//        Calendar c = Calendar.getInstance();
//        c.setTime(date);
//        int year = c.get(Calendar.YEAR);
//        System.out.println(year);
        
        
        
        System.out.println(listeLots);
        
        
    }

    private static double extractPrice(String prixMin) {
       return 0 ;
    }

}
