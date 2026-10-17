package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yk0 implements Runnable {
    public final int f43419a;
    public final PasscodeActivity f43420b;

    public yk0(PasscodeActivity passcodeActivity, int i10) {
        this.f43419a = i10;
        this.f43420b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f43419a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f43420b;
                passcodeActivity.f33217n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f43420b;
                m71 m71Var = passcodeActivity2.V;
                if (m71Var != null) {
                    AndroidUtilities.runOnUIThread(m71Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f43420b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                gb0 gb0Var = passcodeActivity4.U;
                if (gb0Var != null) {
                    AndroidUtilities.runOnUIThread(gb0Var);
                    passcodeActivity4.U = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f43420b;
                yk0 yk0Var = new yk0(passcodeActivity5, 4);
                if (passcodeActivity5.h0()) {
                    j10 = 150;
                } else {
                    j10 = 1000;
                }
                AndroidUtilities.runOnUIThread(yk0Var, j10);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f43420b;
                if (passcodeActivity6.h0()) {
                    for (vr vrVar : passcodeActivity6.f33217n.f41486f) {
                        vrVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f33216f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f43420b;
                passcodeActivity7.R = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity7.f33218r, false);
                return;
            default:
                this.f43420b.n0();
                return;
        }
    }
}
