package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yk0 implements Runnable {
    public final int f40536a;
    public final PasscodeActivity f40537b;

    public yk0(PasscodeActivity passcodeActivity, int i10) {
        this.f40536a = i10;
        this.f40537b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f40536a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f40537b;
                passcodeActivity.f31686n.postDelayed(passcodeActivity.L, 3000L);
                passcodeActivity.K = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.f40537b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                qb0 qb0Var = passcodeActivity3.N;
                if (qb0Var != null) {
                    AndroidUtilities.runOnUIThread(qb0Var);
                    passcodeActivity3.N = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity4 = this.f40537b;
                yk0 yk0Var = new yk0(passcodeActivity4, 3);
                if (passcodeActivity4.e0()) {
                    j10 = 150;
                } else {
                    j10 = 1000;
                }
                AndroidUtilities.runOnUIThread(yk0Var, j10);
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f40537b;
                if (passcodeActivity5.e0()) {
                    for (bs bsVar : passcodeActivity5.f31686n.f40565f) {
                        bsVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity5.f31685f.a(0.0f);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f40537b;
                passcodeActivity6.K = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.f31687r, false);
                return;
            default:
                this.f40537b.k0();
                return;
        }
    }
}
