package org.telegram.ui;

import android.util.SparseIntArray;
public final class tm implements Runnable {
    public final int f50094a;
    public final ym f50095b;

    public tm(ym ymVar, int i7) {
        this.f50094a = i7;
        this.f50095b = ymVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        switch (this.f50094a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                ym ymVar = this.f50095b;
                ymVar.f52271e = sparseIntArray;
                an anVar = ymVar.G;
                org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) anVar.getThemedDrawable("drawableMsgOut");
                ymVar.f52285t = t4Var;
                q4Var = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
                t4Var.J = q4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.t4 t4Var2 = (org.telegram.ui.ActionBar.t4) anVar.getThemedDrawable("drawableMsgOutMedia");
                ymVar.f52286u = t4Var2;
                q4Var2 = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
                t4Var2.J = q4Var2.getMessageDrawableOutMediaStart();
                ymVar.f52285t.K = 0.0f;
                ymVar.f52286u.K = 0.0f;
                anVar.Yc();
                ymVar.u(0.0f);
                return;
            default:
                ym ymVar2 = this.f50095b;
                ymVar2.f52285t.J = null;
                ymVar2.f52286u.J = null;
                ymVar2.f52271e = null;
                ymVar2.u(1.0f);
                return;
        }
    }
}
