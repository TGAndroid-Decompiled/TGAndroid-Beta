package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yc0 implements org.telegram.ui.Components.iw0 {
    public final int f43371a;
    public final org.telegram.ui.ActionBar.n2 f43372b;

    public yc0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f43371a = i10;
        this.f43372b = n2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        tf0 tf0Var;
        zk0 zk0Var;
        switch (this.f43371a) {
            case 0:
                eg0 eg0Var = (eg0) this.f43372b;
                if (i10 > AndroidUtilities.dp(20.0f) && eg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(eg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (tf0Var = eg0Var.T) != null) {
                    tf0Var.run();
                    eg0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f43372b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (zk0Var = passcodeActivity.T) != null) {
                    zk0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
