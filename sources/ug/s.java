package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class s implements Runnable {
    public final int f47799a;
    public final z f47800b;

    public s(z zVar, int i10) {
        this.f47799a = i10;
        this.f47800b = zVar;
    }

    @Override
    public final void run() {
        int i10 = this.f47799a;
        z zVar = this.f47800b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(zVar.d);
                return;
            case 1:
                zVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, zVar.f47844b0, Boolean.TRUE);
                return;
            case 2:
                zVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, zVar.f47844b0, Boolean.FALSE);
                return;
            case 3:
                z.S(zVar);
                return;
            default:
                z.T(zVar);
                return;
        }
    }
}
