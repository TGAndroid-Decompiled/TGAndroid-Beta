package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yc0 implements org.telegram.ui.Components.iw0 {
    public final int f43409a;
    public final org.telegram.ui.ActionBar.n2 f43410b;

    public yc0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f43409a = i10;
        this.f43410b = n2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        uf0 uf0Var;
        zk0 zk0Var;
        switch (this.f43409a) {
            case 0:
                fg0 fg0Var = (fg0) this.f43410b;
                if (i10 > AndroidUtilities.dp(20.0f) && fg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(fg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (uf0Var = fg0Var.T) != null) {
                    uf0Var.run();
                    fg0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f43410b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (zk0Var = passcodeActivity.T) != null) {
                    zk0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
