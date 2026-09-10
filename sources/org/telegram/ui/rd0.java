package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class rd0 implements org.telegram.ui.Components.zv0 {
    public final int f36343a;
    public final org.telegram.ui.ActionBar.p2 f36344b;

    public rd0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f36343a = i10;
        this.f36344b = p2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        lg0 lg0Var;
        ml0 ml0Var;
        switch (this.f36343a) {
            case 0:
                xg0 xg0Var = (xg0) this.f36344b;
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
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36344b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (ml0Var = passcodeActivity.P) != null) {
                    ml0Var.run();
                    passcodeActivity.P = null;
                    return;
                }
                return;
        }
    }
}
