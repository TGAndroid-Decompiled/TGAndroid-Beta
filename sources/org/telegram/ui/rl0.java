package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class rl0 implements Runnable {
    public final int f39544a;
    public final PasscodeActivity f39545b;

    public rl0(PasscodeActivity passcodeActivity, int i10) {
        this.f39544a = i10;
        this.f39545b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f39544a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f39545b;
                passcodeActivity.f31879n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f39545b;
                wg1 wg1Var = passcodeActivity2.V;
                if (wg1Var != null) {
                    AndroidUtilities.runOnUIThread(wg1Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f39545b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                dc0 dc0Var = passcodeActivity4.U;
                if (dc0Var != null) {
                    AndroidUtilities.runOnUIThread(dc0Var);
                    passcodeActivity4.U = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f39545b;
                rl0 rl0Var = new rl0(passcodeActivity5, 4);
                if (passcodeActivity5.h0()) {
                    j10 = 150;
                } else {
                    j10 = 1000;
                }
                AndroidUtilities.runOnUIThread(rl0Var, j10);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f39545b;
                if (passcodeActivity6.h0()) {
                    for (ks ksVar : passcodeActivity6.f31879n.f36645f) {
                        ksVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f31878f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f39545b;
                passcodeActivity7.R = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity7.f31880r, false);
                return;
            default:
                this.f39545b.n0();
                return;
        }
    }
}
