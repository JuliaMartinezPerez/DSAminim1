import java.util.List;

public class LlistaDrons {
    List<Dron> drons;
    public int num = 0;
    public void addDron(int id, String nom, String fabricant, String model) {
        for (int i = 0; i <= num; i++){
            if(i == num) {
                drons.add(new Dron(id, nom, fabricant, model));
                num++;
            }
        }
    }
    public Dron getDron(int idDron){
        for(int i = 0; i<=num; i++){
            if(drons.get(num).idDron == idDron)
                return drons.get(num);
        }
        return null;
    }
}
