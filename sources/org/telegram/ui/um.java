package org.telegram.ui;

import android.util.SparseIntArray;
public final class um implements Runnable {
    public final int f52599a;
    public final zm f52600b;

    public um(zm zmVar, int i7) {
        this.f52599a = i7;
        this.f52600b = zmVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        switch (this.f52599a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                zm zmVar = this.f52600b;
                zmVar.f54584e = sparseIntArray;
                bn bnVar = zmVar.G;
                org.telegram.ui.ActionBar.u4 u4Var = (org.telegram.ui.ActionBar.u4) bnVar.getThemedDrawable("drawableMsgOut");
                zmVar.f54598t = u4Var;
                r4Var = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                u4Var.J = r4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.u4 u4Var2 = (org.telegram.ui.ActionBar.u4) bnVar.getThemedDrawable("drawableMsgOutMedia");
                zmVar.f54599u = u4Var2;
                r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                u4Var2.J = r4Var2.getMessageDrawableOutMediaStart();
                zmVar.f54598t.K = 0.0f;
                zmVar.f54599u.K = 0.0f;
                bnVar.cd();
                zmVar.u(0.0f);
                return;
            default:
                zm zmVar2 = this.f52600b;
                zmVar2.f54598t.J = null;
                zmVar2.f54599u.J = null;
                zmVar2.f54584e = null;
                zmVar2.u(1.0f);
                return;
        }
    }
}
