package kata3;

/**
 * representación gráfica de un Histograma
 * Dado un conjunto de emails calcular el histograma de
 * los dominiosy visualizarlo.
 * 
 * @author angel
 */

public class Kata3 {

    public static void main(String[] args) {
        
        Histogram<String> histo = new Histogram();
        histo.increment("gmal.com");
        histo.increment("gmal.com");
        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");
        histo.increment("gmal.com");
        histo.increment("gmal.com");
        histo.increment("outlook.com");
        histo.increment("outlook.com");
        histo.increment("outlook.com");
        histo.increment("outlook.com");
        histo.increment("outlook.com");
        histo.increment("outlook.com");
        
        HistogramDisplay histoDisplay = new HistogramDisplay(histo);
        histoDisplay.execute();
    }
    
}
