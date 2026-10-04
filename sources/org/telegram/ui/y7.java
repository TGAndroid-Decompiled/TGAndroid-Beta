package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class y7 implements MessagesStorage.BooleanCallback {
    public final k8 f43079a;

    public y7(k8 k8Var) {
        this.f43079a = k8Var;
    }

    @Override
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        org.telegram.ui.ActionBar.c5 c5Var3;
        org.telegram.ui.ActionBar.c5 c5Var4;
        k8 k8Var = this.f43079a;
        k8Var.finishFragment();
        c5Var = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
        if (c5Var != null) {
            c5Var2 = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
            if (c5Var2.getFragmentStack().size() >= 2) {
                c5Var3 = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
                List fragmentStack = c5Var3.getFragmentStack();
                c5Var4 = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(c5Var4.getFragmentStack().size() - 2);
                if (n2Var instanceof yn) {
                    ((yn) n2Var).S7(k8Var.P, k8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        yn ynVar = k8Var.N;
        if (ynVar != null) {
            ynVar.S7(k8Var.P, k8Var.Q + 86400, z10);
        }
    }
}
