package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class z70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.d2 f39221a;
    public final c80 f39222b;

    public z70(c80 c80Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f39222b = c80Var;
        this.f39221a = d2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f39221a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new i10(this, 12), 100L);
        }
    }
}
