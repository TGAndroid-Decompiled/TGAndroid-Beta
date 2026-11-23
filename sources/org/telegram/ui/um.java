package org.telegram.ui;

import android.util.SparseIntArray;
public final class um implements Runnable {
    public final int f52686a;
    public final zm f52687b;

    public um(zm zmVar, int i7) {
        this.f52686a = i7;
        this.f52687b = zmVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        switch (this.f52686a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                zm zmVar = this.f52687b;
                zmVar.f54652e = sparseIntArray;
                bn bnVar = zmVar.G;
                org.telegram.ui.ActionBar.u4 u4Var = (org.telegram.ui.ActionBar.u4) bnVar.getThemedDrawable("drawableMsgOut");
                zmVar.f54666t = u4Var;
                r4Var = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                u4Var.J = r4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.u4 u4Var2 = (org.telegram.ui.ActionBar.u4) bnVar.getThemedDrawable("drawableMsgOutMedia");
                zmVar.f54667u = u4Var2;
                r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                u4Var2.J = r4Var2.getMessageDrawableOutMediaStart();
                zmVar.f54666t.K = 0.0f;
                zmVar.f54667u.K = 0.0f;
                bnVar.cd();
                zmVar.u(0.0f);
                return;
            default:
                zm zmVar2 = this.f52687b;
                zmVar2.f54666t.J = null;
                zmVar2.f54667u.J = null;
                zmVar2.f54652e = null;
                zmVar2.u(1.0f);
                return;
        }
    }
}
