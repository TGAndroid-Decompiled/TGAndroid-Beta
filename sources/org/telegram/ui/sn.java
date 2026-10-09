package org.telegram.ui;

import android.util.SparseIntArray;
public final class sn implements Runnable {
    public final int f41736a;
    public final xn f41737b;

    public sn(xn xnVar, int i10) {
        this.f41736a = i10;
        this.f41737b = xnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        switch (this.f41736a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                xn xnVar = this.f41737b;
                xnVar.f44071e = sparseIntArray;
                zn znVar = xnVar.V;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) znVar.getThemedDrawable("drawableMsgOut");
                xnVar.I = f5Var;
                d5Var = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
                f5Var.J = d5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.f5 f5Var2 = (org.telegram.ui.ActionBar.f5) znVar.getThemedDrawable("drawableMsgOutMedia");
                xnVar.J = f5Var2;
                d5Var2 = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
                f5Var2.J = d5Var2.getMessageDrawableOutMediaStart();
                xnVar.I.K = 0.0f;
                xnVar.J.K = 0.0f;
                znVar.yc();
                xnVar.k(0.0f);
                return;
            default:
                xn xnVar2 = this.f41737b;
                xnVar2.I.J = null;
                xnVar2.J.J = null;
                xnVar2.f44071e = null;
                xnVar2.k(1.0f);
                return;
        }
    }
}
