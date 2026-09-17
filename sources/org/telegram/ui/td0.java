package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class td0 implements org.telegram.ui.Components.pv0 {
    public final int f37719a;
    public final org.telegram.ui.ActionBar.o2 f37720b;

    public td0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f37719a = i10;
        this.f37720b = o2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        ng0 ng0Var;
        ml0 ml0Var;
        switch (this.f37719a) {
            case 0:
                yg0 yg0Var = (yg0) this.f37720b;
                if (i10 > AndroidUtilities.dp(20.0f) && yg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(yg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (ng0Var = yg0Var.T) != null) {
                    ng0Var.run();
                    yg0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37720b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (ml0Var = passcodeActivity.P) != null) {
                    ml0Var.run();
                    passcodeActivity.P = null;
                    return;
                }
                return;
        }
    }
}
