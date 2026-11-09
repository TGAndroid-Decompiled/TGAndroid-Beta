package org.telegram.ui;

import android.util.SparseIntArray;
public final class vm implements Runnable {
    public final int f50718a;
    public final an f50719b;

    public vm(an anVar, int i7) {
        this.f50718a = i7;
        this.f50719b = anVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        switch (this.f50718a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                an anVar = this.f50719b;
                anVar.f43728e = sparseIntArray;
                cn cnVar = anVar.G;
                org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) cnVar.getThemedDrawable("drawableMsgOut");
                anVar.f43742t = t4Var;
                q4Var = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                t4Var.J = q4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.t4 t4Var2 = (org.telegram.ui.ActionBar.t4) cnVar.getThemedDrawable("drawableMsgOutMedia");
                anVar.f43743u = t4Var2;
                q4Var2 = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                t4Var2.J = q4Var2.getMessageDrawableOutMediaStart();
                anVar.f43742t.K = 0.0f;
                anVar.f43743u.K = 0.0f;
                cnVar.bd();
                anVar.u(0.0f);
                return;
            default:
                an anVar2 = this.f50719b;
                anVar2.f43742t.J = null;
                anVar2.f43743u.J = null;
                anVar2.f43728e = null;
                anVar2.u(1.0f);
                return;
        }
    }
}
