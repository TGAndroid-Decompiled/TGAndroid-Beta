package org.telegram.ui;

import android.util.SparseIntArray;
public final class qn implements Runnable {
    public final int f36477a;
    public final vn f36478b;

    public qn(vn vnVar, int i10) {
        this.f36477a = i10;
        this.f36478b = vnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        switch (this.f36477a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                vn vnVar = this.f36478b;
                vnVar.e = sparseIntArray;
                xn xnVar = vnVar.V;
                org.telegram.ui.ActionBar.e5 e5Var = (org.telegram.ui.ActionBar.e5) xnVar.getThemedDrawable("drawableMsgOut");
                vnVar.I = e5Var;
                c5Var = ((org.telegram.ui.ActionBar.n2) xnVar).parentLayout;
                e5Var.H = c5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.e5 e5Var2 = (org.telegram.ui.ActionBar.e5) xnVar.getThemedDrawable("drawableMsgOutMedia");
                vnVar.J = e5Var2;
                c5Var2 = ((org.telegram.ui.ActionBar.n2) xnVar).parentLayout;
                e5Var2.H = c5Var2.getMessageDrawableOutMediaStart();
                vnVar.I.I = 0.0f;
                vnVar.J.I = 0.0f;
                xnVar.uc();
                vnVar.k(0.0f);
                return;
            default:
                vn vnVar2 = this.f36478b;
                vnVar2.I.H = null;
                vnVar2.J.H = null;
                vnVar2.e = null;
                vnVar2.k(1.0f);
                return;
        }
    }
}
