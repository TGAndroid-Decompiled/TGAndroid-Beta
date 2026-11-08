package org.telegram.ui;
public final class xc1 extends org.telegram.ui.ActionBar.j {
    public final zc1 f51830a;

    public xc1(zc1 zc1Var) {
        this.f51830a = zc1Var;
    }

    @Override
    public final void b(int i7) {
        zc1 zc1Var = this.f51830a;
        org.telegram.messenger.ij ijVar = zc1Var.f52528n;
        if (i7 == -1) {
            zc1Var.finishFragment();
        } else if (i7 == 1) {
            if (ijVar != null) {
                ijVar.f23262k.with_my_score = false;
                zc1Var.showDialog(org.telegram.ui.Components.mo0.N0(zc1Var.getParentActivity(), ijVar, null, false, zc1Var.h));
            }
        } else if (i7 == 2) {
            zc1.a0(zc1Var.d, ijVar, zc1Var.getParentActivity(), zc1Var.f52529r, zc1Var.f52526e);
        }
    }
}
