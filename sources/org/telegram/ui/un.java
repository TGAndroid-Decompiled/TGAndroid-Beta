package org.telegram.ui;

import android.util.SparseIntArray;
public final class un implements Runnable {
    public final int f38070a;
    public final zn f38071b;

    public un(zn znVar, int i10) {
        this.f38070a = i10;
        this.f38071b = znVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        switch (this.f38070a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                zn znVar = this.f38071b;
                znVar.e = sparseIntArray;
                bo boVar = znVar.V;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) boVar.getThemedDrawable("drawableMsgOut");
                znVar.I = f5Var;
                d5Var = ((org.telegram.ui.ActionBar.n2) boVar).parentLayout;
                f5Var.H = d5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.f5 f5Var2 = (org.telegram.ui.ActionBar.f5) boVar.getThemedDrawable("drawableMsgOutMedia");
                znVar.J = f5Var2;
                d5Var2 = ((org.telegram.ui.ActionBar.n2) boVar).parentLayout;
                f5Var2.H = d5Var2.getMessageDrawableOutMediaStart();
                znVar.I.I = 0.0f;
                znVar.J.I = 0.0f;
                boVar.uc();
                znVar.k(0.0f);
                return;
            default:
                zn znVar2 = this.f38071b;
                znVar2.I.H = null;
                znVar2.J.H = null;
                znVar2.e = null;
                znVar2.k(1.0f);
                return;
        }
    }
}
