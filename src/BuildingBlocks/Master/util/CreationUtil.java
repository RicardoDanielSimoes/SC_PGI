/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildingBlocks.Master.util;

import BuildingBlocks.Master.BlockGraphic.Type;
import BuildingBlocks.Master.ContactPoint.Datatype;
import BuildingBlocks.Master.Input;
import BuildingBlocks.Master.Output;
import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class CreationUtil {
    
    
    public static ArrayList<Input> createInputList(String[] saInputs){
        ArrayList<Input> alInputs = new ArrayList();
        for(String s : saInputs){
            alInputs.add(new Input(s));
        }
        return alInputs;
    }
    
    
    /**
     * This Function generates an ArrayList<Input> that contains 2 Inputs.
     * @return ArrayList<Inputs> with your inputs
     */
    public static ArrayList<Input> createStandardInputList(){
        ArrayList<Input> alInputs = new ArrayList();
        alInputs.add(new Input("Input 1"));
        alInputs.add(new Input("Input 2"));
        return alInputs;
    }
    
    /**
     * This Function generates an ArrayList<Input> that contains as many inputs
     * the number you give
     * @param amountInputs amount of Inputs you want
     * @return ArrayList<Inputs> with your inputs
     */
    public static ArrayList<Input> createStandardInputList(int amountInputs){
        ArrayList<Input> alInputs = new ArrayList();
        int count = 1;
        while(count <= amountInputs){
            alInputs.add(new Input("Input " + count));
            count++;
        }
        return alInputs;
    }
    
    public static ArrayList<Input> getTimerInputs(){
        ArrayList<Input> alTemp = new ArrayList();
        alTemp.add(new Input("Input"));
        alTemp.get(0).setDataType(Datatype.BOOLEAN);
        alTemp.add(new Input("Timevalue"));
        alTemp.get(0).setDataType(Datatype.STRING);
        return alTemp;
    }
    
    public static Output getOutput(){
        Output out = new Output();
        return out;
    }
}
