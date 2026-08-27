package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

public final class v7 implements MessagesStorage.BooleanCallback {

    public final h8 f43374a;

    public v7(h8 h8Var) {
        this.f43374a = h8Var;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f43374a;
        h8Var.finishFragment();
        if (((org.telegram.ui.ActionBar.n2) h8Var).parentLayout == null || ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout.getFragmentStack().size() < 2) {
            rn rnVar = h8Var.J;
            if (rnVar != null) {
                rnVar.S7(h8Var.L, h8Var.M + 86400, z10);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout.getFragmentStack().get(((org.telegram.ui.ActionBar.n2) h8Var).parentLayout.getFragmentStack().size() - 2);
        if (n2Var instanceof rn) {
            ((rn) n2Var).S7(h8Var.L, h8Var.M + 86400, z10);
        }
    }
}
