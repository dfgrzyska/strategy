/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.strategy.data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

class FileDataSaver implements DataSaver {

    @Override
    public void save(String dataToSave) {
        try {
            Files.write(Paths.get("test.txt"), dataToSave.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(FileDataSaver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
