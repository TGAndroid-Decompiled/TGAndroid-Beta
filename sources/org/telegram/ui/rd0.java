package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class rd0 implements org.telegram.ui.Components.ov0 {
    public final int f37108a;
    public final org.telegram.ui.ActionBar.n2 f37109b;

    public rd0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37108a = i10;
        this.f37109b = n2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        lg0 lg0Var;
        kl0 kl0Var;
        switch (this.f37108a) {
            case 0:
                wg0 wg0Var = (wg0) this.f37109b;
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
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37109b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (kl0Var = passcodeActivity.P) != null) {
                    kl0Var.run();
                    passcodeActivity.P = null;
                    return;
                }
                return;
        }
    }
}
