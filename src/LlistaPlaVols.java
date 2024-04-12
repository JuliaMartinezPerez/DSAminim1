import java.util.List;

public class LlistaPlaVols {
    List<PlaVol> plaVols;
    public int num = 0;
    public void addPla(int idDron, int dia, double hora, int tempsReserva, PosicioDron inici,
                       PosicioDron desti, int idPilot) {
        for (int i = 0; i <= num; i++){
            if(i == num) {
                plaVols.add(new PlaVol(idDron,dia,hora, tempsReserva, inici,
                        desti,idPilot));
                num++;
            }
        }
    }

    public boolean pilotOcupat(int idPilot){
        for(int i = 0; i<=num; i++){
            if(plaVols.get(num).idPilot == idPilot){}
                return true;
        }
        return false;
    }

    public boolean dronOcupat(int idDron){
        for(int i = 0; i<=num; i++){
            if(plaVols.get(num).idDron == idDron)
                return true;
        }
        return false;
    }
}
