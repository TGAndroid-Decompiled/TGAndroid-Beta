package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class u implements Runnable {
    public final int f43225a;
    public final b0 f43226b;

    public u(b0 b0Var, int i10) {
        this.f43225a = i10;
        this.f43226b = b0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f43225a;
        b0 b0Var = this.f43226b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(b0Var.d);
                return;
            case 1:
                b0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b0Var.f43089b0, Boolean.TRUE);
                return;
            case 2:
                b0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b0Var.f43089b0, Boolean.FALSE);
                return;
            case 3:
                b0.R(b0Var);
                return;
            default:
                b0.S(b0Var);
                return;
        }
    }
}
