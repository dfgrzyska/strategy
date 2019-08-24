/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.strategy.data;

/**
 *
 * @author HP
 */
public class DataSaverContext {

    private DataSaver dataSaver;

    public void save(boolean persistInDatabase, String dataToSave) {
        if (!persistInDatabase) {
            this.dataSaver = new FileDataSaver();
            this.dataSaver.save(dataToSave);
            return;
        }
        this.dataSaver = new DatabaseDataSaver();
        this.dataSaver.save(dataToSave);
    }
}
