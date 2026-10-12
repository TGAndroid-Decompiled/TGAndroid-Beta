package org.telegram.ui;

import android.util.SparseIntArray;
public final class wn implements Runnable {
    public final int f43572a;
    public final bo f43573b;

    public wn(bo boVar, int i10) {
        this.f43572a = i10;
        this.f43573b = boVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        switch (this.f43572a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                bo boVar = this.f43573b;
                boVar.f36219e = sparseIntArray;
                eo eoVar = boVar.V;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) eoVar.getThemedDrawable("drawableMsgOut");
                boVar.I = d5Var;
                b5Var = ((org.telegram.ui.ActionBar.m2) eoVar).parentLayout;
                d5Var.J = b5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) eoVar.getThemedDrawable("drawableMsgOutMedia");
                boVar.J = d5Var2;
                b5Var2 = ((org.telegram.ui.ActionBar.m2) eoVar).parentLayout;
                d5Var2.J = b5Var2.getMessageDrawableOutMediaStart();
                boVar.I.K = 0.0f;
                boVar.J.K = 0.0f;
                eoVar.yc();
                boVar.k(0.0f);
                return;
            default:
                bo boVar2 = this.f43573b;
                boVar2.I.J = null;
                boVar2.J.J = null;
                boVar2.f36219e = null;
                boVar2.k(1.0f);
                return;
        }
    }
}
