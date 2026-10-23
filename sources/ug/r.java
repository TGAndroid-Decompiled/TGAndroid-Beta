package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class r implements Runnable {
    public final int f48196a;
    public final y f48197b;

    public r(y yVar, int i10) {
        this.f48196a = i10;
        this.f48197b = yVar;
    }

    @Override
    public final void run() {
        int i10 = this.f48196a;
        y yVar = this.f48197b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(yVar.d);
                return;
            case 1:
                yVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, yVar.f48241b0, Boolean.TRUE);
                return;
            case 2:
                yVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, yVar.f48241b0, Boolean.FALSE);
                return;
            case 3:
                y.R(yVar);
                return;
            default:
                y.S(yVar);
                return;
        }
    }
}
