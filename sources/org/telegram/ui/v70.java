package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class v70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.a2 f38746a;
    public final y70 f38747b;

    public v70(y70 y70Var, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f38747b = y70Var;
        this.f38746a = a2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f38746a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new c10(this, 12), 100L);
        }
    }
}
