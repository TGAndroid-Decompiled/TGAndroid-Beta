package org.telegram.ui;

import android.util.SparseIntArray;
public final class wn implements Runnable {
    public final int f38248a;
    public final bo f38249b;

    public wn(bo boVar, int i10) {
        this.f38248a = i10;
        this.f38249b = boVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        switch (this.f38248a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                bo boVar = this.f38249b;
                boVar.e = sparseIntArray;
                eo eoVar = boVar.V;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) eoVar.getThemedDrawable("drawableMsgOut");
                boVar.I = h5Var;
                f5Var = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
                h5Var.H = f5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) eoVar.getThemedDrawable("drawableMsgOutMedia");
                boVar.J = h5Var2;
                f5Var2 = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
                h5Var2.H = f5Var2.getMessageDrawableOutMediaStart();
                boVar.I.I = 0.0f;
                boVar.J.I = 0.0f;
                eoVar.uc();
                boVar.k(0.0f);
                return;
            default:
                bo boVar2 = this.f38249b;
                boVar2.I.H = null;
                boVar2.J.H = null;
                boVar2.e = null;
                boVar2.k(1.0f);
                return;
        }
    }
}
