package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class v7 implements MessagesStorage.BooleanCallback {
    public final h8 f37427a;

    public v7(h8 h8Var) {
        this.f37427a = h8Var;
    }

    @Override
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.f5 f5Var3;
        org.telegram.ui.ActionBar.f5 f5Var4;
        h8 h8Var = this.f37427a;
        h8Var.finishFragment();
        f5Var = ((org.telegram.ui.ActionBar.p2) h8Var).parentLayout;
        if (f5Var != null) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) h8Var).parentLayout;
            if (f5Var2.getFragmentStack().size() >= 2) {
                f5Var3 = ((org.telegram.ui.ActionBar.p2) h8Var).parentLayout;
                List fragmentStack = f5Var3.getFragmentStack();
                f5Var4 = ((org.telegram.ui.ActionBar.p2) h8Var).parentLayout;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(f5Var4.getFragmentStack().size() - 2);
                if (p2Var instanceof eo) {
                    ((eo) p2Var).S7(h8Var.P, h8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        eo eoVar = h8Var.N;
        if (eoVar != null) {
            eoVar.S7(h8Var.P, h8Var.Q + 86400, z10);
        }
    }
}
