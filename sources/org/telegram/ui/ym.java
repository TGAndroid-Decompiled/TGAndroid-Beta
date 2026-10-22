package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ym extends pf.c {
    public final org.telegram.ui.Cells.u1 d;
    public final cn e;

    public ym(cn cnVar, org.telegram.ui.Cells.u1 u1Var) {
        this.e = cnVar;
        this.d = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new tj(this.e.f36014a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        cn cnVar = this.e;
        qn qnVar = cnVar.f36014a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        qnVar.f40901wb = u1Var.getMessageObject().getId();
        qn qnVar2 = cnVar.f36014a;
        qnVar2.f40915xb = 2;
        qnVar2.f40928yb = null;
        u1Var.invalidate();
    }
}
