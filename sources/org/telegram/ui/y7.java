package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class y7 implements MessagesStorage.BooleanCallback {
    public final k8 f43740a;

    public y7(k8 k8Var) {
        this.f43740a = k8Var;
    }

    @Override
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        org.telegram.ui.ActionBar.h5 h5Var3;
        org.telegram.ui.ActionBar.h5 h5Var4;
        k8 k8Var = this.f43740a;
        k8Var.finishFragment();
        h5Var = ((org.telegram.ui.ActionBar.o2) k8Var).parentLayout;
        if (h5Var != null) {
            h5Var2 = ((org.telegram.ui.ActionBar.o2) k8Var).parentLayout;
            if (h5Var2.getFragmentStack().size() >= 2) {
                h5Var3 = ((org.telegram.ui.ActionBar.o2) k8Var).parentLayout;
                List fragmentStack = h5Var3.getFragmentStack();
                h5Var4 = ((org.telegram.ui.ActionBar.o2) k8Var).parentLayout;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(h5Var4.getFragmentStack().size() - 2);
                if (o2Var instanceof sn) {
                    ((sn) o2Var).V7(k8Var.P, k8Var.Q + 86400, z10);
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
