public class bulb{

    private int id = 1;
    private int level = 1;

    public bulb(){}
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
    public boolean equals(bulb a, bulb b){
        if(a.getLevel() != b.getLevel()){
            return false;
        } else if(a.getName.equals(b.getName())){
            return true;
        } else{
            return false;
        }
    }
    public void copy(bulb test){
        bulb b = new bulb();
        b.setLevel(test.getLevel());
    }
}