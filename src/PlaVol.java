import java.util.Date;

public class PlaVol extends LlistaPlaVols {
    int idDron;
    int dia;
    double hora;
    int tempsReserva; //hores
    PosicioDron inici;
    PosicioDron desti;
    int idPilot;

    public PlaVol(int idDron, int dia, double hora, int tempsReserva, PosicioDron inici,
                  PosicioDron desti, int idPilot) {

        if(!dronOcupat(idDron))
            this.idDron=idDron;
        else this.idDron=-1;

        if(!pilotOcupat(idPilot))
            this.idPilot=idPilot;
        else this.idDron=-1;

        this.dia=dia;
        this.hora=hora;
        this.tempsReserva=tempsReserva;
        this.inici=inici;
        this.desti=desti;
    }

}