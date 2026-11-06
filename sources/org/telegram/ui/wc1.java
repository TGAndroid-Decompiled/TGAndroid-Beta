package org.telegram.ui;
public final class wc1 extends org.telegram.ui.ActionBar.j {
    public final yc1 f51056a;

    public wc1(yc1 yc1Var) {
        this.f51056a = yc1Var;
    }

    @Override
    public final void b(int i7) {
        yc1 yc1Var = this.f51056a;
        org.telegram.messenger.ij ijVar = yc1Var.f52216n;
        if (i7 == -1) {
            yc1Var.finishFragment();
        } else if (i7 == 1) {
            if (ijVar != null) {
                ijVar.f23244k.with_my_score = false;
                yc1Var.showDialog(org.telegram.ui.Components.mo0.N0(yc1Var.getParentActivity(), ijVar, null, false, yc1Var.h));
            }
        } else if (i7 == 2) {
            yc1.a0(yc1Var.d, ijVar, yc1Var.getParentActivity(), yc1Var.f52217r, yc1Var.f52214e);
        }
    }
}
