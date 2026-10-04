package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class z70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.b2 f43719a;
    public final c80 f43720b;

    public z70(c80 c80Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f43720b = c80Var;
        this.f43719a = b2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f43719a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new g10(this, 12), 100L);
        }
    }
}
