/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.test;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import org.primefaces.model.DualListModel;

/**
 *
 * @author Yogesh
 */
@Named(value = "pickListCDI")
@ViewScoped
public class PickListCDI implements Serializable {

    private DualListModel<String> PrizeAcNos;

    /**
     * Creates a new instance of PickListCDI
     */
    public PickListCDI() {
    }

    @PostConstruct
    public void init() {
        ArrayList<String> source = new ArrayList<>();
        source.add("28 - सौ शोभना इंगळे"
                + "'श्री साई छाया' गणेश नगर,"
                + "44 / 5, नवसह्याद्री सोसायटी,"
                + "कर्वे नगर, पुणे 411 005. ");

        PrizeAcNos = new DualListModel<>();
        PrizeAcNos.getSource().addAll(source);
    }

    /**
     * @return the PrizeAcNos
     */
    public DualListModel<String> getPrizeAcNos() {
        return PrizeAcNos;
    }

    /**
     * @param PrizeAcNos the PrizeAcNos to set
     */
    public void setPrizeAcNos(DualListModel<String> PrizeAcNos) {
        this.PrizeAcNos = PrizeAcNos;
    }

}
