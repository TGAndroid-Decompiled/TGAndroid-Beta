package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class v7 implements MessagesStorage.BooleanCallback {
    public final h8 f38640a;

    public v7(h8 h8Var) {
        this.f38640a = h8Var;
    }

    @Override
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        h8 h8Var = this.f38640a;
        h8Var.finishFragment();
        b5Var = ((org.telegram.ui.ActionBar.m2) h8Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) h8Var).parentLayout;
            if (b5Var2.getFragmentStack().size() >= 2) {
                b5Var3 = ((org.telegram.ui.ActionBar.m2) h8Var).parentLayout;
                List fragmentStack = b5Var3.getFragmentStack();
                b5Var4 = ((org.telegram.ui.ActionBar.m2) h8Var).parentLayout;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var4.getFragmentStack().size() - 2);
                if (m2Var instanceof wn) {
                    ((wn) m2Var).S7(h8Var.P, h8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        wn wnVar = h8Var.N;
        if (wnVar != null) {
            wnVar.S7(h8Var.P, h8Var.Q + 86400, z10);
        }
    }
}
