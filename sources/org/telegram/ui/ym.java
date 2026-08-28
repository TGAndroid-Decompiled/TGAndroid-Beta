package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ym extends ve.d {
    public final org.telegram.ui.Cells.t1 d;
    public final cn f44908e;

    public ym(cn cnVar, org.telegram.ui.Cells.t1 t1Var) {
        this.f44908e = cnVar;
        this.d = t1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new oj(this.f44908e.f37236a, 8), 250L);
        }
    }

    @Override
    public final void d() {
        cn cnVar = this.f44908e;
        qn qnVar = cnVar.f37236a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        qnVar.f42075sb = t1Var.getMessageObject().getId();
        qn qnVar2 = cnVar.f37236a;
        qnVar2.f42088tb = 2;
        qnVar2.f42101ub = null;
        t1Var.invalidate();
    }
}
