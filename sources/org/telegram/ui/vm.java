package org.telegram.ui;

import android.util.SparseIntArray;
public final class vm implements Runnable {
    public final int f50757a;
    public final an f50758b;

    public vm(an anVar, int i7) {
        this.f50757a = i7;
        this.f50758b = anVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        switch (this.f50757a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                an anVar = this.f50758b;
                anVar.f43728e = sparseIntArray;
                cn cnVar = anVar.G;
                org.telegram.ui.ActionBar.u4 u4Var = (org.telegram.ui.ActionBar.u4) cnVar.getThemedDrawable("drawableMsgOut");
                anVar.f43742t = u4Var;
                r4Var = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                u4Var.J = r4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.u4 u4Var2 = (org.telegram.ui.ActionBar.u4) cnVar.getThemedDrawable("drawableMsgOutMedia");
                anVar.f43743u = u4Var2;
                r4Var2 = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                u4Var2.J = r4Var2.getMessageDrawableOutMediaStart();
                anVar.f43742t.K = 0.0f;
                anVar.f43743u.K = 0.0f;
                cnVar.bd();
                anVar.u(0.0f);
                return;
            default:
                an anVar2 = this.f50758b;
                anVar2.f43742t.J = null;
                anVar2.f43743u.J = null;
                anVar2.f43728e = null;
                anVar2.u(1.0f);
                return;
        }
    }
}
