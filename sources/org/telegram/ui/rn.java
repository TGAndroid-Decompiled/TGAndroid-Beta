package org.telegram.ui;

import android.util.SparseIntArray;
public final class rn implements Runnable {
    public final int f40169a;
    public final wn f40170b;

    public rn(wn wnVar, int i10) {
        this.f40169a = i10;
        this.f40170b = wnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        switch (this.f40169a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                wn wnVar = this.f40170b;
                wnVar.f42545e = sparseIntArray;
                yn ynVar = wnVar.V;
                org.telegram.ui.ActionBar.e5 e5Var = (org.telegram.ui.ActionBar.e5) ynVar.getThemedDrawable("drawableMsgOut");
                wnVar.I = e5Var;
                c5Var = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
                e5Var.H = c5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.e5 e5Var2 = (org.telegram.ui.ActionBar.e5) ynVar.getThemedDrawable("drawableMsgOutMedia");
                wnVar.J = e5Var2;
                c5Var2 = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
                e5Var2.H = c5Var2.getMessageDrawableOutMediaStart();
                wnVar.I.I = 0.0f;
                wnVar.J.I = 0.0f;
                ynVar.tc();
                wnVar.k(0.0f);
                return;
            default:
                wn wnVar2 = this.f40170b;
                wnVar2.I.H = null;
                wnVar2.J.H = null;
                wnVar2.f42545e = null;
                wnVar2.k(1.0f);
                return;
        }
    }
}
