package org.telegram.ui;

import android.util.SparseIntArray;
public final class vn implements Runnable {
    public final int f41591a;
    public final ao f41592b;

    public vn(ao aoVar, int i10) {
        this.f41591a = i10;
        this.f41592b = aoVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        switch (this.f41591a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                ao aoVar = this.f41592b;
                aoVar.f34489e = sparseIntArray;
                co coVar = aoVar.V;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) coVar.getThemedDrawable("drawableMsgOut");
                aoVar.I = f5Var;
                d5Var = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
                f5Var.H = d5Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.f5 f5Var2 = (org.telegram.ui.ActionBar.f5) coVar.getThemedDrawable("drawableMsgOutMedia");
                aoVar.J = f5Var2;
                d5Var2 = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
                f5Var2.H = d5Var2.getMessageDrawableOutMediaStart();
                aoVar.I.I = 0.0f;
                aoVar.J.I = 0.0f;
                coVar.uc();
                aoVar.k(0.0f);
                return;
            default:
                ao aoVar2 = this.f41592b;
                aoVar2.I.H = null;
                aoVar2.J.H = null;
                aoVar2.f34489e = null;
                aoVar2.k(1.0f);
                return;
        }
    }
}
