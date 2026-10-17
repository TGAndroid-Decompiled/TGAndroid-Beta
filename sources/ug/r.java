package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class r implements Runnable {
    public final int f47771a;
    public final y f47772b;

    public r(y yVar, int i10) {
        this.f47771a = i10;
        this.f47772b = yVar;
    }

    @Override
    public final void run() {
        int i10 = this.f47771a;
        y yVar = this.f47772b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(yVar.d);
                return;
            case 1:
                yVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, yVar.f47816b0, Boolean.TRUE);
                return;
            case 2:
                yVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, yVar.f47816b0, Boolean.FALSE);
                return;
            case 3:
                y.S(yVar);
                return;
            default:
                y.T(yVar);
                return;
        }
    }
}
