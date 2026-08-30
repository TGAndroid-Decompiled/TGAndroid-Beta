package org.telegram.ui;

import android.util.SparseIntArray;
public final class qn implements Runnable {
    public final int f37797a;
    public final vn f37798b;

    public qn(vn vnVar, int i10) {
        this.f37797a = i10;
        this.f37798b = vnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        switch (this.f37797a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                vn vnVar = this.f37798b;
                vnVar.e = sparseIntArray;
                xn xnVar = vnVar.S;
                org.telegram.ui.ActionBar.g5 g5Var = (org.telegram.ui.ActionBar.g5) xnVar.getThemedDrawable("drawableMsgOut");
                vnVar.F = g5Var;
                e5Var = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                g5Var.H = e5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.g5 g5Var2 = (org.telegram.ui.ActionBar.g5) xnVar.getThemedDrawable("drawableMsgOutMedia");
                vnVar.G = g5Var2;
                e5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
                g5Var2.H = e5Var2.getMessageDrawableOutMediaStart();
                vnVar.F.I = 0.0f;
                vnVar.G.I = 0.0f;
                xnVar.uc();
                vnVar.k(0.0f);
                return;
            default:
                vn vnVar2 = this.f37798b;
                vnVar2.F.H = null;
                vnVar2.G.H = null;
                vnVar2.e = null;
                vnVar2.k(1.0f);
                return;
        }
    }
}
