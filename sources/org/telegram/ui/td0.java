package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class td0 implements org.telegram.ui.Components.bw0 {
    public final int f37755a;
    public final org.telegram.ui.ActionBar.n2 f37756b;

    public td0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37755a = i10;
        this.f37756b = n2Var;
    }

    @Override
    public final void G(int i10, boolean z10) {
        ng0 ng0Var;
        nl0 nl0Var;
        switch (this.f37755a) {
            case 0:
                yg0 yg0Var = (yg0) this.f37756b;
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
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37756b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (nl0Var = passcodeActivity.P) != null) {
                    nl0Var.run();
                    passcodeActivity.P = null;
                    return;
                }
                return;
        }
    }
}
