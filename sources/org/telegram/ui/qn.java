package org.telegram.ui;

import android.util.SparseIntArray;
public final class qn implements Runnable {
    public final int f40574a;
    public final vn f40575b;

    public qn(vn vnVar, int i10) {
        this.f40574a = i10;
        this.f40575b = vnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        switch (this.f40574a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                vn vnVar = this.f40575b;
                vnVar.f42261e = sparseIntArray;
                xn xnVar = vnVar.S;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) xnVar.getThemedDrawable("drawableMsgOut");
                vnVar.F = h5Var;
                f5Var = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                h5Var.H = f5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) xnVar.getThemedDrawable("drawableMsgOutMedia");
                vnVar.G = h5Var2;
                f5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                h5Var2.H = f5Var2.getMessageDrawableOutMediaStart();
                vnVar.F.I = 0.0f;
                vnVar.G.I = 0.0f;
                xnVar.uc();
                vnVar.k(0.0f);
                return;
            default:
                vn vnVar2 = this.f40575b;
                vnVar2.F.H = null;
                vnVar2.G.H = null;
                vnVar2.f42261e = null;
                vnVar2.k(1.0f);
                return;
        }
    }
}
