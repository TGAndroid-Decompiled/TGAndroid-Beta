package org.telegram.ui;
public final class ya0 implements org.telegram.ui.Components.qt0 {
    public final int f52178a;
    public final org.telegram.ui.ActionBar.f2 f52179b;

    public ya0(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f52178a = i7;
        this.f52179b = f2Var;
    }

    @Override
    public final void K(int i7, boolean z9) {
        qd0 qd0Var;
        ei0 ei0Var;
        switch (this.f52178a) {
            case 0:
                ce0 ce0Var = (ce0) this.f52179b;
                if (i7 > org.telegram.messenger.g0.L(20.0f) && ce0Var.z1()) {
                    org.telegram.messenger.g0.v1(ce0Var.fragmentView);
                }
                if (i7 <= org.telegram.messenger.g0.L(20.0f) && (qd0Var = ce0Var.T) != null) {
                    qd0Var.run();
                    ce0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f52179b;
                if (i7 >= org.telegram.messenger.g0.L(20.0f) && (ei0Var = passcodeActivity.T) != null) {
                    ei0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
