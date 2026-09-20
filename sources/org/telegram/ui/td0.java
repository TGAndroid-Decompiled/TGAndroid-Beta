package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class td0 implements org.telegram.ui.Components.zv0 {
    public final int f37731a;
    public final org.telegram.ui.ActionBar.n2 f37732b;

    public td0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37731a = i10;
        this.f37732b = n2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        ng0 ng0Var;
        nl0 nl0Var;
        switch (this.f37731a) {
            case 0:
                yg0 yg0Var = (yg0) this.f37732b;
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
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37732b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (nl0Var = passcodeActivity.P) != null) {
                    nl0Var.run();
                    passcodeActivity.P = null;
                    return;
                }
                return;
        }
    }
}
