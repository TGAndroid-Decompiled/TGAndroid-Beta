package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yc0 implements org.telegram.ui.Components.uw0 {
    public final int f46025a;
    public final org.telegram.ui.ActionBar.r2 f46026b;

    public yc0(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f46025a = i10;
        this.f46026b = r2Var;
    }

    @Override
    public final void I(int i10, boolean z10) {
        uf0 uf0Var;
        gl0 gl0Var;
        switch (this.f46025a) {
            case 0:
                gg0 gg0Var = (gg0) this.f46026b;
                if (i10 > AndroidUtilities.dp(20.0f) && gg0Var.m1()) {
                    AndroidUtilities.hideKeyboard(gg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (uf0Var = gg0Var.T) != null) {
                    uf0Var.run();
                    gg0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f46026b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (gl0Var = passcodeActivity.T) != null) {
                    gl0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
