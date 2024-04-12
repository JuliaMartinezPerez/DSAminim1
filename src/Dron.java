public class Dron {
    int idDron;
    String nomDron;
    String fabricantDron;
    String modelDron;
    double horesVol;
    boolean almacen; //TRUE = dins l'almacen o en manteniment
    public Dron(int id, String nom, String fabricant, String model) {
        this.idDron = id;
        this.nomDron = nom;
        this.fabricantDron = fabricant;
        this.modelDron = model;
    }
}
