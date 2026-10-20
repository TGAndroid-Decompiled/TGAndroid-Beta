package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wk0 implements Runnable {
    public final int f42891a;
    public final PasscodeActivity f42892b;

    public wk0(PasscodeActivity passcodeActivity, int i10) {
        this.f42891a = i10;
        this.f42892b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f42891a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f42892b;
                passcodeActivity.f33229n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f42892b;
                k71 k71Var = passcodeActivity2.V;
                if (k71Var != null) {
                    AndroidUtilities.runOnUIThread(k71Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f42892b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                eb0 eb0Var = passcodeActivity4.U;
                if (eb0Var != null) {
                    AndroidUtilities.runOnUIThread(eb0Var);
                    passcodeActivity4.U = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f42892b;
                wk0 wk0Var = new wk0(passcodeActivity5, 4);
                if (passcodeActivity5.h0()) {
                    j10 = 150;
                } else {
                    j10 = 1000;
                }
                AndroidUtilities.runOnUIThread(wk0Var, j10);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f42892b;
                if (passcodeActivity6.h0()) {
                    for (tr trVar : passcodeActivity6.f33229n.f40959f) {
                        trVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f33228f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f42892b;
                passcodeActivity7.R = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity7.f33230r, false);
                return;
            default:
                this.f42892b.n0();
                return;
        }
    }
}
