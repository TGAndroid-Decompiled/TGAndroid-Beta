package org.telegram.ui;

import android.util.SparseIntArray;
public final class um implements Runnable {
    public final int f52588a;
    public final zm f52589b;

    public um(zm zmVar, int i7) {
        this.f52588a = i7;
        this.f52589b = zmVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        switch (this.f52588a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                zm zmVar = this.f52589b;
                zmVar.f54551e = sparseIntArray;
                bn bnVar = zmVar.G;
                org.telegram.ui.ActionBar.u4 u4Var = (org.telegram.ui.ActionBar.u4) bnVar.getThemedDrawable("drawableMsgOut");
                zmVar.f54565t = u4Var;
                r4Var = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                u4Var.J = r4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.u4 u4Var2 = (org.telegram.ui.ActionBar.u4) bnVar.getThemedDrawable("drawableMsgOutMedia");
                zmVar.f54566u = u4Var2;
                r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                u4Var2.J = r4Var2.getMessageDrawableOutMediaStart();
                zmVar.f54565t.K = 0.0f;
                zmVar.f54566u.K = 0.0f;
                bnVar.cd();
                zmVar.u(0.0f);
                return;
            default:
                zm zmVar2 = this.f52589b;
                zmVar2.f54565t.J = null;
                zmVar2.f54566u.J = null;
                zmVar2.f54551e = null;
                zmVar2.u(1.0f);
                return;
        }
    }
}
