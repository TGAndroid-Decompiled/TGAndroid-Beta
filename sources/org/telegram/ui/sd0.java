package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sd0 implements org.telegram.ui.Components.aw0 {
    public final int f37254a;
    public final org.telegram.ui.ActionBar.n2 f37255b;

    public sd0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37254a = i10;
        this.f37255b = n2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        mg0 mg0Var;
        nl0 nl0Var;
        switch (this.f37254a) {
            case 0:
                xg0 xg0Var = (xg0) this.f37255b;
                if (i10 > AndroidUtilities.dp(20.0f) && xg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(xg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (mg0Var = xg0Var.T) != null) {
                    mg0Var.run();
                    xg0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37255b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (nl0Var = passcodeActivity.P) != null) {
                    nl0Var.run();
                    passcodeActivity.P = null;
                    return;
                }
                return;
        }
    }
}
