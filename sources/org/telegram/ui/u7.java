package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class u7 implements MessagesStorage.BooleanCallback {
    public final g8 f42349a;

    public u7(g8 g8Var) {
        this.f42349a = g8Var;
    }

    @Override
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        org.telegram.ui.ActionBar.d5 d5Var4;
        g8 g8Var = this.f42349a;
        g8Var.finishFragment();
        d5Var = ((org.telegram.ui.ActionBar.n2) g8Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) g8Var).parentLayout;
            if (d5Var2.getFragmentStack().size() >= 2) {
                d5Var3 = ((org.telegram.ui.ActionBar.n2) g8Var).parentLayout;
                List fragmentStack = d5Var3.getFragmentStack();
                d5Var4 = ((org.telegram.ui.ActionBar.n2) g8Var).parentLayout;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var4.getFragmentStack().size() - 2);
                if (n2Var instanceof zn) {
                    ((zn) n2Var).V7(g8Var.P, g8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        zn znVar = g8Var.N;
        if (znVar != null) {
            znVar.V7(g8Var.P, g8Var.Q + 86400, z10);
        }
    }
}
