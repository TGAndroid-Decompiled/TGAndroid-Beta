package org.telegram.ui;
public final class za0 implements org.telegram.ui.Components.cu0 {
    public final int f54509a;
    public final org.telegram.ui.ActionBar.g2 f54510b;

    public za0(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f54509a = i7;
        this.f54510b = g2Var;
    }

    @Override
    public final void L(int i7, boolean z10) {
        rd0 rd0Var;
        ji0 ji0Var;
        switch (this.f54509a) {
            case 0:
                de0 de0Var = (de0) this.f54510b;
                if (i7 > org.telegram.messenger.g0.L(20.0f) && de0Var.z1()) {
                    org.telegram.messenger.g0.v1(de0Var.fragmentView);
                }
                if (i7 <= org.telegram.messenger.g0.L(20.0f) && (rd0Var = de0Var.U) != null) {
                    rd0Var.run();
                    de0Var.U = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f54510b;
                if (i7 >= org.telegram.messenger.g0.L(20.0f) && (ji0Var = passcodeActivity.U) != null) {
                    ji0Var.run();
                    passcodeActivity.U = null;
                    return;
                }
                return;
        }
    }
}
