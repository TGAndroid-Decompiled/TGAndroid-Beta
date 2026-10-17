package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class y7 implements MessagesStorage.BooleanCallback {
    public final k8 f43335a;

    public y7(k8 k8Var) {
        this.f43335a = k8Var;
    }

    @Override
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        org.telegram.ui.ActionBar.d5 d5Var4;
        k8 k8Var = this.f43335a;
        k8Var.finishFragment();
        d5Var = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
            if (d5Var2.getFragmentStack().size() >= 2) {
                d5Var3 = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
                List fragmentStack = d5Var3.getFragmentStack();
                d5Var4 = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var4.getFragmentStack().size() - 2);
                if (n2Var instanceof sn) {
                    ((sn) n2Var).V7(k8Var.P, k8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        sn snVar = k8Var.N;
        if (snVar != null) {
            snVar.V7(k8Var.P, k8Var.Q + 86400, z10);
        }
    }
}
