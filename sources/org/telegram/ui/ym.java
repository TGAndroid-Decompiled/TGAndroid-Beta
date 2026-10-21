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
            AndroidUtilities.runOnUIThread(new tj(this.e.f36011a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        cn cnVar = this.e;
        qn qnVar = cnVar.f36011a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        qnVar.f40898wb = u1Var.getMessageObject().getId();
        qn qnVar2 = cnVar.f36011a;
        qnVar2.f40912xb = 2;
        qnVar2.f40925yb = null;
        u1Var.invalidate();
    }
}
