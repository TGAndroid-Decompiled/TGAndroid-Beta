package org.telegram.ui;
public final class ua0 implements org.telegram.ui.Components.pt0 {
    public final int f50024a;
    public final org.telegram.ui.ActionBar.d2 f50025b;

    public ua0(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f50024a = i3;
        this.f50025b = d2Var;
    }

    @Override
    public final void K(int i3, boolean z10) {
        nd0 nd0Var;
        bi0 bi0Var;
        switch (this.f50024a) {
            case 0:
                xd0 xd0Var = (xd0) this.f50025b;
                if (i3 > org.telegram.messenger.g0.L(20.0f) && xd0Var.q1()) {
                    org.telegram.messenger.g0.v1(xd0Var.fragmentView);
                }
                if (i3 <= org.telegram.messenger.g0.L(20.0f) && (nd0Var = xd0Var.U) != null) {
                    nd0Var.run();
                    xd0Var.U = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f50025b;
                if (i3 >= org.telegram.messenger.g0.L(20.0f) && (bi0Var = passcodeActivity.U) != null) {
                    bi0Var.run();
                    passcodeActivity.U = null;
                    return;
                }
                return;
        }
    }
}
