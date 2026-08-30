package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class zk0 implements Runnable {
    public final int f40821a;
    public final PasscodeActivity f40822b;
    public final boolean f40823c;

    public zk0(PasscodeActivity passcodeActivity, boolean z4, int i10) {
        this.f40821a = i10;
        this.f40822b = passcodeActivity;
        this.f40823c = z4;
    }

    @Override
    public final void run() {
        switch (this.f40821a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f40822b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f40823c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    qb0 qb0Var = passcodeActivity.N;
                    if (qb0Var != null) {
                        AndroidUtilities.runOnUIThread(qb0Var);
                        passcodeActivity.N = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f40822b;
                passcodeActivity2.f31689w.e(true, this.f40823c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.M);
                return;
        }
    }
}
