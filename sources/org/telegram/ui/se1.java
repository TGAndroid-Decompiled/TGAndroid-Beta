package org.telegram.ui;
public final class se1 extends org.telegram.ui.ActionBar.k {
    public final ue1 f41354a;

    public se1(ue1 ue1Var) {
        this.f41354a = ue1Var;
    }

    @Override
    public final void b(int i10) {
        ue1 ue1Var = this.f41354a;
        org.telegram.messenger.kj kjVar = ue1Var.f41929n;
        if (i10 == -1) {
            ue1Var.finishFragment();
        } else if (i10 == 1) {
            if (kjVar != null) {
                kjVar.f16690k.with_my_score = false;
                ue1Var.showDialog(org.telegram.ui.Components.pp0.N0(ue1Var.getParentActivity(), kjVar, null, false, ue1Var.h));
            }
        } else if (i10 == 2) {
            ue1.a0(ue1Var.d, kjVar, ue1Var.getParentActivity(), ue1Var.f41930r, ue1Var.e);
        }
    }
}
