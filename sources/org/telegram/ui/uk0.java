package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class uk0 implements Runnable {

    public final int f43245a;

    public final PasscodeActivity f43246b;

    public uk0(PasscodeActivity passcodeActivity, int i10) {
        this.f43245a = i10;
        this.f43246b = passcodeActivity;
    }

    @Override
    public final void run() {
        switch (this.f43245a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f43246b;
                passcodeActivity.f35573n.postDelayed(passcodeActivity.K, 3000L);
                passcodeActivity.J = true;
                break;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.f43246b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                jb0 jb0Var = passcodeActivity3.M;
                if (jb0Var != null) {
                    AndroidUtilities.runOnUIThread(jb0Var);
                    passcodeActivity3.M = null;
                }
                break;
            case 2:
                PasscodeActivity passcodeActivity4 = this.f43246b;
                AndroidUtilities.runOnUIThread(new uk0(passcodeActivity4, 3), passcodeActivity4.e0() ? 150L : 1000L);
                break;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f43246b;
                if (passcodeActivity5.e0()) {
                    for (wr wrVar : passcodeActivity5.f35573n.f43279f) {
                        wrVar.i(0.0f);
                    }
                } else {
                    passcodeActivity5.f35572f.a(0.0f);
                }
                break;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f43246b;
                passcodeActivity6.J = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.f35574r, false);
                break;
            default:
                this.f43246b.k0();
                break;
        }
    }
}
