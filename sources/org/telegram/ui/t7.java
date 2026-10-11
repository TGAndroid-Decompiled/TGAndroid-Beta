package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class t7 implements MessagesStorage.BooleanCallback {
    public final f8 f42129a;

    public t7(f8 f8Var) {
        this.f42129a = f8Var;
    }

    @Override
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        f8 f8Var = this.f42129a;
        f8Var.finishFragment();
        b5Var = ((org.telegram.ui.ActionBar.m2) f8Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) f8Var).parentLayout;
            if (b5Var2.getFragmentStack().size() >= 2) {
                b5Var3 = ((org.telegram.ui.ActionBar.m2) f8Var).parentLayout;
                List fragmentStack = b5Var3.getFragmentStack();
                b5Var4 = ((org.telegram.ui.ActionBar.m2) f8Var).parentLayout;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var4.getFragmentStack().size() - 2);
                if (m2Var instanceof zn) {
                    ((zn) m2Var).V7(f8Var.P, f8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        zn znVar = f8Var.N;
        if (znVar != null) {
            znVar.V7(f8Var.P, f8Var.Q + 86400, z10);
        }
    }
}
