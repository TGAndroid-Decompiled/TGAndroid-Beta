package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zk0 implements Runnable {
    public final int f44170a;
    public final PasscodeActivity f44171b;

    public zk0(PasscodeActivity passcodeActivity, int i10) {
        this.f44170a = i10;
        this.f44171b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f44170a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f44171b;
                passcodeActivity.f33531n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f44171b;
                o71 o71Var = passcodeActivity2.V;
                if (o71Var != null) {
                    AndroidUtilities.runOnUIThread(o71Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f44171b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                kb0 kb0Var = passcodeActivity4.U;
                if (kb0Var != null) {
                    AndroidUtilities.runOnUIThread(kb0Var);
                    passcodeActivity4.U = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f44171b;
                zk0 zk0Var = new zk0(passcodeActivity5, 4);
                if (passcodeActivity5.h0()) {
                    j10 = 150;
                } else {
                    j10 = 1000;
                }
                AndroidUtilities.runOnUIThread(zk0Var, j10);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f44171b;
                if (passcodeActivity6.h0()) {
                    for (vr vrVar : passcodeActivity6.f33531n.f41793f) {
                        vrVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f33530f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f44171b;
                passcodeActivity7.R = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity7.f33532r, false);
                return;
            default:
                this.f44171b.n0();
                return;
        }
    }
}
