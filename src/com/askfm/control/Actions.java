package com.askfm.control;

import com.askfm.actions.GeneralActions;

/**
 * @author William
 *
 */
public class Actions {

    private static GeneralActions generalActions;

    public static void setupActions() {
        generalActions = new GeneralActions();
    }

    public static GeneralActions generalActions(){
        return generalActions;
    }

}
