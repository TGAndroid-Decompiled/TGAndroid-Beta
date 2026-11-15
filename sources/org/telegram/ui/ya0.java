package org.telegram.ui;
public final class ya0 implements org.telegram.ui.Components.rt0 {
    public final int f53483a;
    public final org.telegram.ui.ActionBar.e2 f53484b;

    public ya0(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f53483a = i7;
        this.f53484b = e2Var;
    }

    @Override
    public final void L(int i7, boolean z10) {
        qd0 qd0Var;
        gi0 gi0Var;
        switch (this.f53483a) {
            case 0:
                ce0 ce0Var = (ce0) this.f53484b;
                if (i7 > org.telegram.messenger.g0.L(20.0f) && ce0Var.z1()) {
                    org.telegram.messenger.g0.v1(ce0Var.fragmentView);
                }
                if (i7 <= org.telegram.messenger.g0.L(20.0f) && (qd0Var = ce0Var.U) != null) {
                    qd0Var.run();
                    ce0Var.U = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f53484b;
                if (i7 >= org.telegram.messenger.g0.L(20.0f) && (gi0Var = passcodeActivity.U) != null) {
                    gi0Var.run();
                    passcodeActivity.U = null;
                    return;
                }
                return;
        }
    }
}
