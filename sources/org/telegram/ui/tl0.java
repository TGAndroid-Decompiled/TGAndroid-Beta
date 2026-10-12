package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class tl0 implements Runnable {
    public final int f40409a;
    public final PasscodeActivity f40410b;
    public final boolean f40411c;

    public tl0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f40409a = i10;
        this.f40410b = passcodeActivity;
        this.f40411c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40409a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f40410b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f40411c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    ec0 ec0Var = passcodeActivity.U;
                    if (ec0Var != null) {
                        AndroidUtilities.runOnUIThread(ec0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f40410b;
                passcodeActivity2.f32180w.e(true, this.f40411c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.T);
                return;
        }
    }
}
