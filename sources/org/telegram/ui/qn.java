package org.telegram.ui;

import android.util.SparseIntArray;
public final class qn implements Runnable {
    public final int f36779a;
    public final vn f36780b;

    public qn(vn vnVar, int i10) {
        this.f36779a = i10;
        this.f36780b = vnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        switch (this.f36779a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                vn vnVar = this.f36780b;
                vnVar.e = sparseIntArray;
                xn xnVar = vnVar.V;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) xnVar.getThemedDrawable("drawableMsgOut");
                vnVar.I = f5Var;
                d5Var = ((org.telegram.ui.ActionBar.o2) xnVar).parentLayout;
                f5Var.H = d5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.f5 f5Var2 = (org.telegram.ui.ActionBar.f5) xnVar.getThemedDrawable("drawableMsgOutMedia");
                vnVar.J = f5Var2;
                d5Var2 = ((org.telegram.ui.ActionBar.o2) xnVar).parentLayout;
                f5Var2.H = d5Var2.getMessageDrawableOutMediaStart();
                vnVar.I.I = 0.0f;
                vnVar.J.I = 0.0f;
                xnVar.uc();
                vnVar.k(0.0f);
                return;
            default:
                vn vnVar2 = this.f36780b;
                vnVar2.I.H = null;
                vnVar2.J.H = null;
                vnVar2.e = null;
                vnVar2.k(1.0f);
                return;
        }
    }
}
