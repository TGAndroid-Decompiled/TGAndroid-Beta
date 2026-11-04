package org.telegram.ui;
public final class sc1 extends org.telegram.ui.ActionBar.j {
    public final uc1 f49475a;

    public sc1(uc1 uc1Var) {
        this.f49475a = uc1Var;
    }

    @Override
    public final void b(int i3) {
        uc1 uc1Var = this.f49475a;
        org.telegram.messenger.zi ziVar = uc1Var.f50048n;
        if (i3 == -1) {
            uc1Var.finishFragment();
        } else if (i3 == 1) {
            if (ziVar != null) {
                ziVar.f26868k.with_my_score = false;
                uc1Var.showDialog(org.telegram.ui.Components.oo0.N0(uc1Var.getParentActivity(), ziVar, null, false, uc1Var.h));
            }
        } else if (i3 == 2) {
            uc1.a0(uc1Var.d, ziVar, uc1Var.getParentActivity(), uc1Var.f50049r, uc1Var.f50046e);
        }
    }
}
