/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupD.corepackage;

/**
 *
 * @author Dominic
 */
public class SpecialCell extends Cell{
    
    public enum cellType {
        UPPER, DOWNER, BONUS
    }
    
    cellType type;
    
    public SpecialCell(int cellnumber, cellType type){
        super(cellnumber);
        this.type = type;
    }
    
    public Enum getCellType(){
        return type;
    }
}
