package org.telegram.ui;

import android.util.SparseIntArray;
public final class un implements Runnable {
    public final int f38102a;
    public final zn f38103b;

    public un(zn znVar, int i10) {
        this.f38102a = i10;
        this.f38103b = znVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        switch (this.f38102a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                zn znVar = this.f38103b;
                znVar.e = sparseIntArray;
                bo boVar = znVar.V;
                org.telegram.ui.ActionBar.g5 g5Var = (org.telegram.ui.ActionBar.g5) boVar.getThemedDrawable("drawableMsgOut");
                znVar.I = g5Var;
                e5Var = ((org.telegram.ui.ActionBar.o2) boVar).parentLayout;
                g5Var.H = e5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.g5 g5Var2 = (org.telegram.ui.ActionBar.g5) boVar.getThemedDrawable("drawableMsgOutMedia");
                znVar.J = g5Var2;
                e5Var2 = ((org.telegram.ui.ActionBar.o2) boVar).parentLayout;
                g5Var2.H = e5Var2.getMessageDrawableOutMediaStart();
                znVar.I.I = 0.0f;
                znVar.J.I = 0.0f;
                boVar.uc();
                znVar.k(0.0f);
                return;
            default:
                zn znVar2 = this.f38103b;
                znVar2.I.H = null;
                znVar2.J.H = null;
                znVar2.e = null;
                znVar2.k(1.0f);
                return;
        }
    }
}
