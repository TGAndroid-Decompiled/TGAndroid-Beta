package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wc0 implements org.telegram.ui.Components.kw0 {
    public final int f42535a;
    public final org.telegram.ui.ActionBar.n2 f42536b;

    public wc0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f42535a = i10;
        this.f42536b = n2Var;
    }

    @Override
    public final void G(int i10, boolean z10) {
        sf0 sf0Var;
        xk0 xk0Var;
        switch (this.f42535a) {
            case 0:
                dg0 dg0Var = (dg0) this.f42536b;
                if (i10 > AndroidUtilities.dp(20.0f) && dg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(dg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (sf0Var = dg0Var.T) != null) {
                    sf0Var.run();
                    dg0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f42536b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (xk0Var = passcodeActivity.T) != null) {
                    xk0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
