package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class zk0 implements Runnable {
    public final int f43783a;
    public final PasscodeActivity f43784b;
    public final boolean f43785c;

    public zk0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f43783a = i10;
        this.f43784b = passcodeActivity;
        this.f43785c = z10;
    }

    @Override
    public final void run() {
        switch (this.f43783a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f43784b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f43785c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    gb0 gb0Var = passcodeActivity.U;
                    if (gb0Var != null) {
                        AndroidUtilities.runOnUIThread(gb0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f43784b;
                passcodeActivity2.f33227w.e(true, this.f43785c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.T);
                return;
        }
    }
}
