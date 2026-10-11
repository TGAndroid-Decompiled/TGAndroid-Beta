package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class z70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.a2 f44599a;
    public final c80 f44600b;

    public z70(c80 c80Var, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f44600b = c80Var;
        this.f44599a = a2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f44599a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new tz(this, 13), 100L);
        }
    }
}
