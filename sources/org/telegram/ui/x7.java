package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class x7 implements MessagesStorage.BooleanCallback {
    public final j8 f42988a;

    public x7(j8 j8Var) {
        this.f42988a = j8Var;
    }

    @Override
    public final void run(boolean z4) {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.f5 f5Var3;
        org.telegram.ui.ActionBar.f5 f5Var4;
        j8 j8Var = this.f42988a;
        j8Var.finishFragment();
        f5Var = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
        if (f5Var != null) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
            if (f5Var2.getFragmentStack().size() >= 2) {
                f5Var3 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
                List fragmentStack = f5Var3.getFragmentStack();
                f5Var4 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(f5Var4.getFragmentStack().size() - 2);
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
