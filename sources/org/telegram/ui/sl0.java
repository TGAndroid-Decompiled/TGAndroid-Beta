package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sl0 implements Runnable {
    public final int f40173a;
    public final PasscodeActivity f40174b;

    public sl0(PasscodeActivity passcodeActivity, int i10) {
        this.f40173a = i10;
        this.f40174b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f40173a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f40174b;
                passcodeActivity.f32177n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f40174b;
                je1 je1Var = passcodeActivity2.V;
                if (je1Var != null) {
                    AndroidUtilities.runOnUIThread(je1Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f40174b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                ec0 ec0Var = passcodeActivity4.U;
                if (ec0Var != null) {
                    AndroidUtilities.runOnUIThread(ec0Var);
                    passcodeActivity4.U = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f40174b;
                sl0 sl0Var = new sl0(passcodeActivity5, 4);
                if (passcodeActivity5.h0()) {
                    j10 = 150;
                } else {
                    j10 = 1000;
                }
                AndroidUtilities.runOnUIThread(sl0Var, j10);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f40174b;
                if (passcodeActivity6.h0()) {
                    for (ks ksVar : passcodeActivity6.f32177n.f36949f) {
                        ksVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f32176f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f40174b;
                passcodeActivity7.R = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity7.f32178r, false);
                return;
            default:
                this.f40174b.n0();
                return;
        }
    }
}
