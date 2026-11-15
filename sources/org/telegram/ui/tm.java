package org.telegram.ui;

import android.util.SparseIntArray;
public final class tm implements Runnable {
    public final int f51610a;
    public final ym f51611b;

    public tm(ym ymVar, int i7) {
        this.f51610a = i7;
        this.f51611b = ymVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        switch (this.f51610a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                ym ymVar = this.f51611b;
                ymVar.f53544e = sparseIntArray;
                an anVar = ymVar.G;
                org.telegram.ui.ActionBar.r4 r4Var = (org.telegram.ui.ActionBar.r4) anVar.getThemedDrawable("drawableMsgOut");
                ymVar.f53558t = r4Var;
                o4Var = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
                r4Var.J = o4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.r4 r4Var2 = (org.telegram.ui.ActionBar.r4) anVar.getThemedDrawable("drawableMsgOutMedia");
                ymVar.f53559u = r4Var2;
                o4Var2 = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
                r4Var2.J = o4Var2.getMessageDrawableOutMediaStart();
                ymVar.f53558t.K = 0.0f;
                ymVar.f53559u.K = 0.0f;
                anVar.cd();
                ymVar.u(0.0f);
                return;
            default:
                ym ymVar2 = this.f51611b;
                ymVar2.f53558t.J = null;
                ymVar2.f53559u.J = null;
                ymVar2.f53544e = null;
                ymVar2.u(1.0f);
                return;
        }
    }
}
