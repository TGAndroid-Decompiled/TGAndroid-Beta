package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zm extends pf.c {
    public final org.telegram.ui.Cells.t1 d;
    public final dn e;

    public zm(dn dnVar, org.telegram.ui.Cells.t1 t1Var) {
        this.e = dnVar;
        this.d = t1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new tj(this.e.f36651a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        dn dnVar = this.e;
        sn snVar = dnVar.f36651a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        snVar.Jb = t1Var.getMessageObject().getId();
        sn snVar2 = dnVar.f36651a;
        snVar2.Kb = 2;
        snVar2.Lb = null;
        t1Var.invalidate();
    }
}
