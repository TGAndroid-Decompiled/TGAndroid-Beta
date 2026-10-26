package vg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class t implements Runnable {
    public final int f50258a;
    public final a0 f50259b;

    public t(a0 a0Var, int i10) {
        this.f50258a = i10;
        this.f50259b = a0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f50258a;
        a0 a0Var = this.f50259b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(a0Var.d);
                return;
            case 1:
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.f50119b0, Boolean.TRUE);
                return;
            case 2:
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.f50119b0, Boolean.FALSE);
                return;
            case 3:
                a0.R(a0Var);
                return;
            default:
                a0.S(a0Var);
                return;
        }
    }
}
