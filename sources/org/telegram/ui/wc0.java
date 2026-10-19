package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wc0 implements org.telegram.ui.Components.jw0 {
    public final int f42528a;
    public final org.telegram.ui.ActionBar.n2 f42529b;

    public wc0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f42528a = i10;
        this.f42529b = n2Var;
    }

    @Override
    public final void G(int i10, boolean z10) {
        rf0 rf0Var;
        xk0 xk0Var;
        switch (this.f42528a) {
            case 0:
                cg0 cg0Var = (cg0) this.f42529b;
                if (i10 > AndroidUtilities.dp(20.0f) && cg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(cg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (rf0Var = cg0Var.T) != null) {
                    rf0Var.run();
                    cg0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f42529b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (xk0Var = passcodeActivity.T) != null) {
                    xk0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
