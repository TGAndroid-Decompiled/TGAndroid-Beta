package org.telegram.ui;
public final class ya0 implements org.telegram.ui.Components.bu0 {
    public final int f54328a;
    public final org.telegram.ui.ActionBar.g2 f54329b;

    public ya0(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f54328a = i7;
        this.f54329b = g2Var;
    }

    @Override
    public final void L(int i7, boolean z10) {
        qd0 qd0Var;
        hi0 hi0Var;
        switch (this.f54328a) {
            case 0:
                de0 de0Var = (de0) this.f54329b;
                if (i7 > org.telegram.messenger.g0.L(20.0f) && de0Var.z1()) {
                    org.telegram.messenger.g0.v1(de0Var.fragmentView);
                }
                if (i7 <= org.telegram.messenger.g0.L(20.0f) && (qd0Var = de0Var.U) != null) {
                    qd0Var.run();
                    de0Var.U = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f54329b;
                if (i7 >= org.telegram.messenger.g0.L(20.0f) && (hi0Var = passcodeActivity.U) != null) {
                    hi0Var.run();
                    passcodeActivity.U = null;
                    return;
                }
                return;
        }
    }
}
