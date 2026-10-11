package org.telegram.ui;

import android.util.SparseIntArray;
public final class sn implements Runnable {
    public final int f41801a;
    public final xn f41802b;

    public sn(xn xnVar, int i10) {
        this.f41801a = i10;
        this.f41802b = xnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        switch (this.f41801a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                xn xnVar = this.f41802b;
                xnVar.f44148e = sparseIntArray;
                zn znVar = xnVar.V;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) znVar.getThemedDrawable("drawableMsgOut");
                xnVar.I = d5Var;
                b5Var = ((org.telegram.ui.ActionBar.m2) znVar).parentLayout;
                d5Var.J = b5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) znVar.getThemedDrawable("drawableMsgOutMedia");
                xnVar.J = d5Var2;
                b5Var2 = ((org.telegram.ui.ActionBar.m2) znVar).parentLayout;
                d5Var2.J = b5Var2.getMessageDrawableOutMediaStart();
                xnVar.I.K = 0.0f;
                xnVar.J.K = 0.0f;
                znVar.yc();
                xnVar.k(0.0f);
                return;
            default:
                xn xnVar2 = this.f41802b;
                xnVar2.I.J = null;
                xnVar2.J.J = null;
                xnVar2.f44148e = null;
                xnVar2.k(1.0f);
                return;
        }
    }
}
