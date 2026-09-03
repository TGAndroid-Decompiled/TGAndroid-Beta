package org.telegram.ui;

import android.util.SparseIntArray;
public final class sn implements Runnable {
    public final int f38267a;
    public final xn f38268b;

    public sn(xn xnVar, int i10) {
        this.f38267a = i10;
        this.f38268b = xnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        switch (this.f38267a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                xn xnVar = this.f38268b;
                xnVar.e = sparseIntArray;
                zn znVar = xnVar.S;
                org.telegram.ui.ActionBar.g5 g5Var = (org.telegram.ui.ActionBar.g5) znVar.getThemedDrawable("drawableMsgOut");
                xnVar.F = g5Var;
                e5Var = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
                g5Var.H = e5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.g5 g5Var2 = (org.telegram.ui.ActionBar.g5) znVar.getThemedDrawable("drawableMsgOutMedia");
                xnVar.G = g5Var2;
                e5Var2 = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
                g5Var2.H = e5Var2.getMessageDrawableOutMediaStart();
                xnVar.F.I = 0.0f;
                xnVar.G.I = 0.0f;
                znVar.uc();
                xnVar.k(0.0f);
                return;
            default:
                xn xnVar2 = this.f38268b;
                xnVar2.F.H = null;
                xnVar2.G.H = null;
                xnVar2.e = null;
                xnVar2.k(1.0f);
                return;
        }
    }
}
