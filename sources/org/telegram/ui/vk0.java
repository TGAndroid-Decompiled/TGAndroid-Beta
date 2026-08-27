package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class vk0 implements Runnable {

    public final int f43481a;

    public final PasscodeActivity f43482b;

    public final boolean f43483c;

    public vk0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f43481a = i10;
        this.f43482b = passcodeActivity;
        this.f43483c = z10;
    }

    @Override
    public final void run() {
        switch (this.f43481a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f43482b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f43483c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    jb0 jb0Var = passcodeActivity.M;
                    if (jb0Var != null) {
                        AndroidUtilities.runOnUIThread(jb0Var);
                        passcodeActivity.M = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                break;
            default:
                PasscodeActivity passcodeActivity2 = this.f43482b;
                passcodeActivity2.f35576w.e(true, this.f43483c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.L);
                break;
        }
    }
}
