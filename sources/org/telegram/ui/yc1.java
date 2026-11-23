package org.telegram.ui;
public final class yc1 extends org.telegram.ui.ActionBar.j {
    public final ad1 f54343a;

    public yc1(ad1 ad1Var) {
        this.f54343a = ad1Var;
    }

    @Override
    public final void b(int i7) {
        ad1 ad1Var = this.f54343a;
        org.telegram.messenger.fj fjVar = ad1Var.f45701n;
        if (i7 == -1) {
            ad1Var.finishFragment();
        } else if (i7 == 1) {
            if (fjVar != null) {
                fjVar.f24073k.with_my_score = false;
                ad1Var.showDialog(org.telegram.ui.Components.zo0.O0(ad1Var.getParentActivity(), fjVar, null, false, ad1Var.h));
            }
        } else if (i7 == 2) {
            ad1.a0(ad1Var.d, fjVar, ad1Var.getParentActivity(), ad1Var.f45702r, ad1Var.f45699e);
        }
    }
}
