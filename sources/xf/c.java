package xf;

import android.os.Bundle;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.tn;
import org.telegram.ui.ze1;
public final class c implements Runnable {
    public final int f50121a;
    public final NotificationCenter.NotificationCenterDelegate f50122b;

    public c(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f50121a = i10;
        this.f50122b = notificationCenterDelegate;
    }

    @Override
    public final void run() {
        int i10 = this.f50121a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f50122b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (f6) notificationCenterDelegate, Boolean.TRUE, null, -1);
                return;
            default:
                ze1 ze1Var = (ze1) notificationCenterDelegate;
                if (ze1Var.getParentLayout() != null) {
                    ze1Var.D = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ze1Var.f45155a);
                    tn tnVar = new tn(bundle);
                    tnVar.f42811fa = true;
                    ze1Var.presentFragment(tnVar);
                    return;
                }
                return;
        }
    }
}
