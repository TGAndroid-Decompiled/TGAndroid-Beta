package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ud0 implements org.telegram.ui.Components.nw0 {
    public final int f40376a;
    public final org.telegram.ui.ActionBar.m2 f40377b;

    public ud0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f40376a = i10;
        this.f40377b = m2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        pg0 pg0Var;
        sl0 sl0Var;
        switch (this.f40376a) {
            case 0:
                ah0 ah0Var = (ah0) this.f40377b;
                if (i10 > AndroidUtilities.dp(20.0f) && ah0Var.h1()) {
                    AndroidUtilities.hideKeyboard(ah0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (pg0Var = ah0Var.T) != null) {
                    pg0Var.run();
                    ah0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f40377b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (sl0Var = passcodeActivity.T) != null) {
                    sl0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
