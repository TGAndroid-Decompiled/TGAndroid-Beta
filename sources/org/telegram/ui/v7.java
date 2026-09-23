package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class v7 implements MessagesStorage.BooleanCallback {
    public final h8 f38314a;

    public v7(h8 h8Var) {
        this.f38314a = h8Var;
    }

    @Override
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        org.telegram.ui.ActionBar.c5 c5Var3;
        org.telegram.ui.ActionBar.c5 c5Var4;
        h8 h8Var = this.f38314a;
        h8Var.finishFragment();
        c5Var = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
        if (c5Var != null) {
            c5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
            if (c5Var2.getFragmentStack().size() >= 2) {
                c5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                List fragmentStack = c5Var3.getFragmentStack();
                c5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(c5Var4.getFragmentStack().size() - 2);
                if (n2Var instanceof xn) {
                    ((xn) n2Var).S7(h8Var.P, h8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        xn xnVar = h8Var.N;
        if (xnVar != null) {
            xnVar.S7(h8Var.P, h8Var.Q + 86400, z10);
        }
    }
}
