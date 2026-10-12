package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class z7 implements MessagesStorage.BooleanCallback {
    public final l8 f42499a;

    public z7(l8 l8Var) {
        this.f42499a = l8Var;
    }

    @Override
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        l8 l8Var = this.f42499a;
        l8Var.finishFragment();
        b5Var = ((org.telegram.ui.ActionBar.m2) l8Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) l8Var).parentLayout;
            if (b5Var2.getFragmentStack().size() >= 2) {
                b5Var3 = ((org.telegram.ui.ActionBar.m2) l8Var).parentLayout;
                List fragmentStack = b5Var3.getFragmentStack();
                b5Var4 = ((org.telegram.ui.ActionBar.m2) l8Var).parentLayout;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var4.getFragmentStack().size() - 2);
                if (m2Var instanceof fo) {
                    ((fo) m2Var).V7(l8Var.P, l8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        fo foVar = l8Var.N;
        if (foVar != null) {
            foVar.V7(l8Var.P, l8Var.Q + 86400, z10);
        }
    }
}
