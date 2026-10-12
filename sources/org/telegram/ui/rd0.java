package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class rd0 implements org.telegram.ui.Components.xw0 {
    public final int f41612a;
    public final org.telegram.ui.ActionBar.m2 f41613b;

    public rd0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f41612a = i10;
        this.f41613b = m2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        lg0 lg0Var;
        pl0 pl0Var;
        switch (this.f41612a) {
            case 0:
                xg0 xg0Var = (xg0) this.f41613b;
                if (i10 > AndroidUtilities.dp(20.0f) && xg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(xg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (lg0Var = xg0Var.T) != null) {
                    lg0Var.run();
                    xg0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f41613b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (pl0Var = passcodeActivity.T) != null) {
                    pl0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
