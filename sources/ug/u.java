package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class u implements Runnable {
    public final int f47240a;
    public final b0 f47241b;

    public u(b0 b0Var, int i10) {
        this.f47240a = i10;
        this.f47241b = b0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f47240a;
        b0 b0Var = this.f47241b;
        switch (i10) {
            case 0:
                AndroidUtilities.hideKeyboard(b0Var.d);
                return;
            case 1:
                b0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b0Var.f47097b0, Boolean.TRUE);
                return;
            case 2:
                b0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b0Var.f47097b0, Boolean.FALSE);
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
