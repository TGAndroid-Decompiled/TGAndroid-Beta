package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class v7 implements MessagesStorage.BooleanCallback {
    public final h8 f41459a;

    public v7(h8 h8Var) {
        this.f41459a = h8Var;
    }

    @Override
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        org.telegram.ui.ActionBar.d5 d5Var4;
        h8 h8Var = this.f41459a;
        h8Var.finishFragment();
        d5Var = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
            if (d5Var2.getFragmentStack().size() >= 2) {
                d5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                List fragmentStack = d5Var3.getFragmentStack();
                d5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var4.getFragmentStack().size() - 2);
                if (n2Var instanceof co) {
                    ((co) n2Var).S7(h8Var.P, h8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        co coVar = h8Var.N;
        if (coVar != null) {
            coVar.S7(h8Var.P, h8Var.Q + 86400, z10);
        }
    }
}
