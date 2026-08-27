package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class zm extends we.d {
    public final org.telegram.ui.Cells.s1 d;

    public final dn f45210e;

    public zm(dn dnVar, org.telegram.ui.Cells.s1 s1Var) {
        this.f45210e = dnVar;
        this.d = s1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new qj(this.f45210e.f37446a, 8), 250L);
    }

    @Override
    public final void d() {
        dn dnVar = this.f45210e;
        rn rnVar = dnVar.f37446a;
        org.telegram.ui.Cells.s1 s1Var = this.d;
        rnVar.f42211sb = s1Var.getMessageObject().getId();
        rn rnVar2 = dnVar.f37446a;
        rnVar2.f42224tb = 2;
        rnVar2.f42237ub = null;
        s1Var.invalidate();
    }
}
