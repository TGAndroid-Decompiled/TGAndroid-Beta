package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class s implements Runnable {
    public final int f48474a;
    public final z f48475b;

    public s(z zVar, int i10) {
        this.f48474a = i10;
        this.f48475b = zVar;
    }

    @Override
    public final void run() {
        int i10 = this.f48474a;
        z zVar = this.f48475b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(zVar.d);
                return;
            case 1:
                zVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, zVar.f48520b0, Boolean.TRUE);
                return;
            case 2:
                zVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, zVar.f48520b0, Boolean.FALSE);
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
