/*
 * Classname            ConvertCoordinates
 * Version information  x.x.xx
 * Date                 24/10/2018 20:20
 * Author               Kimberly P. Lima && Laercio Santos
 * Copyright notice     Esta classe implementa a conversão de coordenadas 
 *                      geográficas decimais para Km, usando a fórmula de 
 *                      Harvesine.
 */
package finder.com.br.application;

/**
 *
 * @author kimberlyplima
 */
public class ConvertCoordinates {
    private double lat1;
    private double lat2;
    private double long1;
    private double long2;
    private double distance;
    private int r = 6371;
    
    public ConvertCoordinates(String[] source, String[] destination){
        /* 
         * Converte as latitudes e longitudes dos vértices em double
         * e atribui às variáveis locais.
         */
        this.lat1 = Double.parseDouble(source[0]);
        this.lat2 = Double.parseDouble(destination[0]);
        this.long1 = Double.parseDouble(source[1]);
        this.long2 = Double.parseDouble(destination[1]);
        
        /*
         * Fórmula de Haversine
         */
        double latDistance = Math.toRadians(this.lat2 - this.lat1);
        double longDistance = Math.toRadians(this.long2 - this.long1);
        double a = Math.sin(latDistance/2) * Math.sin(latDistance/2) 
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(longDistance/2) * Math.sin(longDistance/2);
        
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        this.distance = c * r;        
    }
    
    /*
     * Retorna a distância entre os pontos em Km
     */
    public double getDistance(){
        return this.distance;
    }
}
