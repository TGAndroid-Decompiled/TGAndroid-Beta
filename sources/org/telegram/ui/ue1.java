package org.telegram.ui;
public final class ue1 extends org.telegram.ui.ActionBar.k {
    public final we1 f42127a;

    public ue1(we1 we1Var) {
        this.f42127a = we1Var;
    }

    @Override
    public final void b(int i10) {
        we1 we1Var = this.f42127a;
        org.telegram.messenger.jj jjVar = we1Var.f42972n;
        if (i10 == -1) {
            we1Var.finishFragment();
        } else if (i10 == 1) {
            if (jjVar != null) {
                jjVar.f16337k.with_my_score = false;
                we1Var.showDialog(org.telegram.ui.Components.op0.N0(we1Var.getParentActivity(), jjVar, null, false, we1Var.h));
            }
        } else if (i10 == 2) {
            we1.Z(we1Var.d, jjVar, we1Var.getParentActivity(), we1Var.f42973r, we1Var.e);
        }
    }
}
