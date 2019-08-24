/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.strategy;

import pl.dg.designpattern.strategy.data.DataSaverContext;

/**
 *
 * @author HP
 */
public class Main {

    static boolean persistInDatabase = false;
    static DataSaverContext ctx = new DataSaverContext();

    public static void main(String[] args) {
        ctx.save(persistInDatabase, "abc");
        persistInDatabase = true;
        ctx.save(persistInDatabase, "wow");

    }
}
