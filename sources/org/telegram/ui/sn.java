package org.telegram.ui;

import android.util.SparseIntArray;
public final class sn implements Runnable {
    public final int f37430a;
    public final xn f37431b;

    public sn(xn xnVar, int i10) {
        this.f37430a = i10;
        this.f37431b = xnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        switch (this.f37430a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                xn xnVar = this.f37431b;
                xnVar.e = sparseIntArray;
                zn znVar = xnVar.V;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) znVar.getThemedDrawable("drawableMsgOut");
                xnVar.I = f5Var;
                d5Var = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
                f5Var.H = d5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.f5 f5Var2 = (org.telegram.ui.ActionBar.f5) znVar.getThemedDrawable("drawableMsgOutMedia");
                xnVar.J = f5Var2;
                d5Var2 = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
                f5Var2.H = d5Var2.getMessageDrawableOutMediaStart();
                xnVar.I.I = 0.0f;
                xnVar.J.I = 0.0f;
                znVar.uc();
                xnVar.k(0.0f);
                return;
            default:
                xn xnVar2 = this.f37431b;
                xnVar2.I.H = null;
                xnVar2.J.H = null;
                xnVar2.e = null;
                xnVar2.k(1.0f);
                return;
        }
    }
}
