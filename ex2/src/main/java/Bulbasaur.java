public class Bulbasaur{

    private int id = 1;
    private int level = 1;

    public Bulbasaur(){
        id = 1;
        level = 1;
    }
    public void setLevel(int lv){
        level = lv;
        if(lv >= 16 && lv <= 31){
            id = 2;
        } else if (lv >= 32){
            id =3;
        }
    }
    public int getLevel(){
        return level;
    }
    public String getName(){
        if(id == 1){
            return "Bulbasaur";
        } else if (id == 2){
            return "Ivysaur";
        } else if (id == 3){
            return "Vensaur";
        } else {
            return "";
        }
    }
    public int getID(){
        return id;
    }
    public String toString(){
        return "" + level + " " + getName();
    }
    public boolean equals(Bulbasaur a, Bulbasaur b){
        if(a.getLevel() != b.getLevel()){
            return false;
        } else if(a.getName().equals(b.getName())){
            return true;
        } else{
            return false;
        }
    }
    public void copy(Bulbasaur test){
        Bulbasaur b = new Bulbasaur();
        b.setLevel(test.getLevel());
    }
}
