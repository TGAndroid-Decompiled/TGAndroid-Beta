package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class vk0 implements Runnable {
    public final int f43507a;
    public final PasscodeActivity f43508b;
    public final boolean f43509c;

    public vk0(PasscodeActivity passcodeActivity, boolean z10, int i9) {
        this.f43507a = i9;
        this.f43508b = passcodeActivity;
        this.f43509c = z10;
    }

    @Override
    public final void run() {
        switch (this.f43507a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f43508b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f43509c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    fb0 fb0Var = passcodeActivity.M;
                    if (fb0Var != null) {
                        AndroidUtilities.runOnUIThread(fb0Var);
                        passcodeActivity.M = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f43508b;
                passcodeActivity2.f35573w.e(true, this.f43509c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.L);
                return;
        }
    }
}
