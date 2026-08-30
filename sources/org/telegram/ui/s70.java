package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class s70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.d2 f38207a;
    public final u70 f38208b;

    public s70(u70 u70Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f38208b = u70Var;
        this.f38207a = d2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f38207a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new c10(this, 12), 100L);
        }
    }
}
