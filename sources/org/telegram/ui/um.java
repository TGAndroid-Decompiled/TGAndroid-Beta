package org.telegram.ui;

import android.util.SparseIntArray;
public final class um implements Runnable {
    public final int f52603a;
    public final zm f52604b;

    public um(zm zmVar, int i7) {
        this.f52603a = i7;
        this.f52604b = zmVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        switch (this.f52603a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                zm zmVar = this.f52604b;
                zmVar.f54588e = sparseIntArray;
                bn bnVar = zmVar.G;
                org.telegram.ui.ActionBar.u4 u4Var = (org.telegram.ui.ActionBar.u4) bnVar.getThemedDrawable("drawableMsgOut");
                zmVar.f54602t = u4Var;
                r4Var = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                u4Var.J = r4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.u4 u4Var2 = (org.telegram.ui.ActionBar.u4) bnVar.getThemedDrawable("drawableMsgOutMedia");
                zmVar.f54603u = u4Var2;
                r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                u4Var2.J = r4Var2.getMessageDrawableOutMediaStart();
                zmVar.f54602t.K = 0.0f;
                zmVar.f54603u.K = 0.0f;
                bnVar.cd();
                zmVar.u(0.0f);
                return;
            default:
                zm zmVar2 = this.f52604b;
                zmVar2.f54602t.J = null;
                zmVar2.f54603u.J = null;
                zmVar2.f54588e = null;
                zmVar2.u(1.0f);
                return;
        }
    }
}
