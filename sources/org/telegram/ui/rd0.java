package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class rd0 implements org.telegram.ui.Components.nv0 {
    public final int f40147a;
    public final org.telegram.ui.ActionBar.n2 f40148b;

    public rd0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f40147a = i10;
        this.f40148b = n2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        lg0 lg0Var;
        nl0 nl0Var;
        switch (this.f40147a) {
            case 0:
                wg0 wg0Var = (wg0) this.f40148b;
                if (i10 > AndroidUtilities.dp(20.0f) && wg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(wg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (lg0Var = wg0Var.T) != null) {
                    lg0Var.run();
                    wg0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f40148b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (nl0Var = passcodeActivity.P) != null) {
                    nl0Var.run();
                    passcodeActivity.P = null;
                    return;
                }
                return;
        }
    }
}
