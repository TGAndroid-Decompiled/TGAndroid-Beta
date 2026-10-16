package org.telegram.ui;

import android.util.SparseIntArray;
public final class xn implements Runnable {
    public final int f41601a;
    public final co f41602b;

    public xn(co coVar, int i10) {
        this.f41601a = i10;
        this.f41602b = coVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        switch (this.f41601a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                co coVar = this.f41602b;
                coVar.e = sparseIntArray;
                fo foVar = coVar.V;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) foVar.getThemedDrawable("drawableMsgOut");
                coVar.I = d5Var;
                b5Var = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
                d5Var.J = b5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) foVar.getThemedDrawable("drawableMsgOutMedia");
                coVar.J = d5Var2;
                b5Var2 = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
                d5Var2.J = b5Var2.getMessageDrawableOutMediaStart();
                coVar.I.K = 0.0f;
                coVar.J.K = 0.0f;
                foVar.yc();
                coVar.k(0.0f);
                return;
            default:
                co coVar2 = this.f41602b;
                coVar2.I.J = null;
                coVar2.J.J = null;
                coVar2.e = null;
                coVar2.k(1.0f);
                return;
        }
    }
}
