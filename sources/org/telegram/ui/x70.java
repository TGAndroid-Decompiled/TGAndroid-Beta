package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class x70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.b2 f39196a;
    public final a80 f39197b;

    public x70(a80 a80Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f39197b = a80Var;
        this.f39196a = b2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f39196a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new d10(this, 12), 100L);
        }
    }
}
