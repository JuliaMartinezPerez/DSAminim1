import java.util.List;

public class LlistaPilots {
    List<Pilot> pilots;
    public int num = 0;
    public void addPilot(int id, String nom, String cognom) {
        for (int i = 0; i <= num; i++){
            if(i == num) {
                pilots.add(new Pilot(id, nom, cognom));
                num++;
                for(int n=0; n<=num; n++){

                }
            }
        }
    }

    public Pilot getPilot(int idPilot){
        for(int i = 0; i<=num; i++){
            if(pilots.get(num).idPilot == idPilot)
                return pilots.get(num);
        }

        return null;
    }

}