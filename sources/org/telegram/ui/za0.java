package org.telegram.ui;
public final class za0 implements org.telegram.ui.Components.zt0 {
    public final int f54465a;
    public final org.telegram.ui.ActionBar.h2 f54466b;

    public za0(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f54465a = i7;
        this.f54466b = h2Var;
    }

    @Override
    public final void L(int i7, boolean z10) {
        sd0 sd0Var;
        ji0 ji0Var;
        switch (this.f54465a) {
            case 0:
                ee0 ee0Var = (ee0) this.f54466b;
                if (i7 > org.telegram.messenger.g0.L(20.0f) && ee0Var.z1()) {
                    org.telegram.messenger.g0.v1(ee0Var.fragmentView);
                }
                if (i7 <= org.telegram.messenger.g0.L(20.0f) && (sd0Var = ee0Var.U) != null) {
                    sd0Var.run();
                    ee0Var.U = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f54466b;
                if (i7 >= org.telegram.messenger.g0.L(20.0f) && (ji0Var = passcodeActivity.U) != null) {
                    ji0Var.run();
                    passcodeActivity.U = null;
                    return;
                }
                return;
        }
    }
}
