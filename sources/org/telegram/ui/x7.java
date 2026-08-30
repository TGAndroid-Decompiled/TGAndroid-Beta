package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class x7 implements MessagesStorage.BooleanCallback {
    public final j8 f39869a;

    public x7(j8 j8Var) {
        this.f39869a = j8Var;
    }

    @Override
    public final void run(boolean z4) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.e5 e5Var3;
        org.telegram.ui.ActionBar.e5 e5Var4;
        j8 j8Var = this.f39869a;
        j8Var.finishFragment();
        e5Var = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
            if (e5Var2.getFragmentStack().size() >= 2) {
                e5Var3 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
                List fragmentStack = e5Var3.getFragmentStack();
                e5Var4 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(e5Var4.getFragmentStack().size() - 2);
                if (p2Var instanceof xn) {
                    ((xn) p2Var).S7(j8Var.M, j8Var.N + 86400, z4);
                    return;
                }
                return;
            }
        }
        xn xnVar = j8Var.K;
        if (xnVar != null) {
            xnVar.S7(j8Var.M, j8Var.N + 86400, z4);
        }
    }
}
