package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class u70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.d2 f38699a;
    public final w70 f38700b;

    public u70(w70 w70Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f38700b = w70Var;
        this.f38699a = d2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f38699a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new d10(this, 12), 100L);
        }
    }
}
