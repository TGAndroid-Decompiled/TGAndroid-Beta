package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class x7 implements MessagesStorage.BooleanCallback {
    public final j8 f43780a;

    public x7(j8 j8Var) {
        this.f43780a = j8Var;
    }

    @Override
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        j8 j8Var = this.f43780a;
        j8Var.finishFragment();
        b5Var = ((org.telegram.ui.ActionBar.m2) j8Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) j8Var).parentLayout;
            if (b5Var2.getFragmentStack().size() >= 2) {
                b5Var3 = ((org.telegram.ui.ActionBar.m2) j8Var).parentLayout;
                List fragmentStack = b5Var3.getFragmentStack();
                b5Var4 = ((org.telegram.ui.ActionBar.m2) j8Var).parentLayout;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var4.getFragmentStack().size() - 2);
                if (m2Var instanceof eo) {
                    ((eo) m2Var).V7(j8Var.P, j8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        eo eoVar = j8Var.N;
        if (eoVar != null) {
            eoVar.V7(j8Var.P, j8Var.Q + 86400, z10);
        }
    }
}
