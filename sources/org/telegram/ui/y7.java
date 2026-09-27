package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class y7 implements MessagesStorage.BooleanCallback {
    public final k8 f40150a;

    public y7(k8 k8Var) {
        this.f40150a = k8Var;
    }

    @Override
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        org.telegram.ui.ActionBar.d5 d5Var4;
        k8 k8Var = this.f40150a;
        k8Var.finishFragment();
        d5Var = ((org.telegram.ui.ActionBar.o2) k8Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.o2) k8Var).parentLayout;
            if (d5Var2.getFragmentStack().size() >= 2) {
                d5Var3 = ((org.telegram.ui.ActionBar.o2) k8Var).parentLayout;
                List fragmentStack = d5Var3.getFragmentStack();
                d5Var4 = ((org.telegram.ui.ActionBar.o2) k8Var).parentLayout;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(d5Var4.getFragmentStack().size() - 2);
                if (o2Var instanceof xn) {
                    ((xn) o2Var).S7(k8Var.P, k8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        xn xnVar = k8Var.N;
        if (xnVar != null) {
            xnVar.S7(k8Var.P, k8Var.Q + 86400, z10);
        }
    }
}
