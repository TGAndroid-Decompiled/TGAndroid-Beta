package org.telegram.ui;

import android.util.SparseIntArray;
public final class um implements Runnable {
    public final int f52582a;
    public final zm f52583b;

    public um(zm zmVar, int i7) {
        this.f52582a = i7;
        this.f52583b = zmVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.s4 s4Var2;
        switch (this.f52582a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                zm zmVar = this.f52583b;
                zmVar.f54537e = sparseIntArray;
                bn bnVar = zmVar.G;
                org.telegram.ui.ActionBar.v4 v4Var = (org.telegram.ui.ActionBar.v4) bnVar.getThemedDrawable("drawableMsgOut");
                zmVar.f54551t = v4Var;
                s4Var = ((org.telegram.ui.ActionBar.h2) bnVar).parentLayout;
                v4Var.J = s4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.v4 v4Var2 = (org.telegram.ui.ActionBar.v4) bnVar.getThemedDrawable("drawableMsgOutMedia");
                zmVar.f54552u = v4Var2;
                s4Var2 = ((org.telegram.ui.ActionBar.h2) bnVar).parentLayout;
                v4Var2.J = s4Var2.getMessageDrawableOutMediaStart();
                zmVar.f54551t.K = 0.0f;
                zmVar.f54552u.K = 0.0f;
                bnVar.cd();
                zmVar.u(0.0f);
                return;
            default:
                zm zmVar2 = this.f52583b;
                zmVar2.f54551t.J = null;
                zmVar2.f54552u.J = null;
                zmVar2.f54537e = null;
                zmVar2.u(1.0f);
                return;
        }
    }
}
