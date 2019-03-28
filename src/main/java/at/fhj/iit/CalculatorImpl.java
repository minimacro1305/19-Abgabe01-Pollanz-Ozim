package at.fhj.iit;
import java.util.ArrayList;
import java.util.List;
public class CalculatorImpl implements Calculator {

    List<Integer> list;

    CalculatorImpl(){
        this.list= new ArrayList<Integer>();
    }

    public int getMaximum() {
        return 0;
    }

    public int getMinimum() {


        int min = this.list.get(0);
        for(int i = 0; i< this.list.size(); i++){
            if(min>this.list.get(i)){
                min=this.list.get(i);
            }
        }
        return min;
    }

    public void addValue(int value) {
        this.list.add(value);
    }
}








