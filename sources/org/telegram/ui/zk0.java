package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class zk0 implements Runnable {
    public final int f43757a;
    public final PasscodeActivity f43758b;
    public final boolean f43759c;

    public zk0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f43757a = i10;
        this.f43758b = passcodeActivity;
        this.f43759c = z10;
    }

    @Override
    public final void run() {
        switch (this.f43757a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f43758b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f43759c) {
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
                PasscodeActivity passcodeActivity2 = this.f43758b;
                passcodeActivity2.f33220w.e(true, this.f43759c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.T);
                return;
        }
    }
}
