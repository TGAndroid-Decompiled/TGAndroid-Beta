package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class uk0 implements Runnable {
    public final int f43265a;
    public final PasscodeActivity f43266b;

    public uk0(PasscodeActivity passcodeActivity, int i9) {
        this.f43265a = i9;
        this.f43266b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f43265a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f43266b;
                passcodeActivity.f35570n.postDelayed(passcodeActivity.K, 3000L);
                passcodeActivity.J = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.f43266b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                fb0 fb0Var = passcodeActivity3.M;
                if (fb0Var != null) {
                    AndroidUtilities.runOnUIThread(fb0Var);
                    passcodeActivity3.M = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity4 = this.f43266b;
                uk0 uk0Var = new uk0(passcodeActivity4, 3);
                if (passcodeActivity4.d0()) {
                    j10 = 150;
                } else {
                    j10 = 1000;
                }
                AndroidUtilities.runOnUIThread(uk0Var, j10);
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f43266b;
                if (passcodeActivity5.d0()) {
                    for (vr vrVar : passcodeActivity5.f35570n.f42755f) {
                        vrVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity5.f35569f.a(0.0f);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f43266b;
                passcodeActivity6.J = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.f35571r, false);
                return;
            default:
                this.f43266b.j0();
                return;
        }
    }
}
