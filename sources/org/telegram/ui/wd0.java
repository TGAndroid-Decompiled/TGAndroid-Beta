package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wd0 implements org.telegram.ui.Components.nw0 {
    public final int f41253a;
    public final org.telegram.ui.ActionBar.m2 f41254b;

    public wd0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f41253a = i10;
        this.f41254b = m2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        qg0 qg0Var;
        tl0 tl0Var;
        switch (this.f41253a) {
            case 0:
                bh0 bh0Var = (bh0) this.f41254b;
                if (i10 > AndroidUtilities.dp(20.0f) && bh0Var.h1()) {
                    AndroidUtilities.hideKeyboard(bh0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (qg0Var = bh0Var.T) != null) {
                    qg0Var.run();
                    bh0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f41254b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (tl0Var = passcodeActivity.T) != null) {
                    tl0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
