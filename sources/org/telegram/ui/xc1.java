package org.telegram.ui;
public final class xc1 extends org.telegram.ui.ActionBar.j {
    public final zc1 f53174a;

    public xc1(zc1 zc1Var) {
        this.f53174a = zc1Var;
    }

    @Override
    public final void b(int i7) {
        zc1 zc1Var = this.f53174a;
        org.telegram.messenger.gj gjVar = zc1Var.f53906n;
        if (i7 == -1) {
            zc1Var.finishFragment();
        } else if (i7 == 1) {
            if (gjVar != null) {
                gjVar.f23819k.with_my_score = false;
                zc1Var.showDialog(org.telegram.ui.Components.po0.N0(zc1Var.getParentActivity(), gjVar, null, false, zc1Var.h));
            }
        } else if (i7 == 2) {
            zc1.a0(zc1Var.d, gjVar, zc1Var.getParentActivity(), zc1Var.f53907r, zc1Var.f53904e);
        }
    }
}
