package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class x7 implements MessagesStorage.BooleanCallback {
    public final j8 f39405a;

    public x7(j8 j8Var) {
        this.f39405a = j8Var;
    }

    @Override
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.e5 e5Var3;
        org.telegram.ui.ActionBar.e5 e5Var4;
        j8 j8Var = this.f39405a;
        j8Var.finishFragment();
        e5Var = ((org.telegram.ui.ActionBar.o2) j8Var).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.o2) j8Var).parentLayout;
            if (e5Var2.getFragmentStack().size() >= 2) {
                e5Var3 = ((org.telegram.ui.ActionBar.o2) j8Var).parentLayout;
                List fragmentStack = e5Var3.getFragmentStack();
                e5Var4 = ((org.telegram.ui.ActionBar.o2) j8Var).parentLayout;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(e5Var4.getFragmentStack().size() - 2);
                if (o2Var instanceof bo) {
                    ((bo) o2Var).S7(j8Var.P, j8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        bo boVar = j8Var.N;
        if (boVar != null) {
            boVar.S7(j8Var.P, j8Var.Q + 86400, z10);
        }
    }
}
