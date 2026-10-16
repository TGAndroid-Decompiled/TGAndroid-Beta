package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class sl0 implements Runnable {
    public final int f39845a;
    public final PasscodeActivity f39846b;
    public final boolean f39847c;

    public sl0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f39845a = i10;
        this.f39846b = passcodeActivity;
        this.f39847c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39845a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f39846b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f39847c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    dc0 dc0Var = passcodeActivity.U;
                    if (dc0Var != null) {
                        AndroidUtilities.runOnUIThread(dc0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f39846b;
                passcodeActivity2.f31882w.e(true, this.f39847c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.T);
                return;
        }
    }
}
