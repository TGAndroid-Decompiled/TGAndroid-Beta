package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class t70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.d2 f41513a;
    public final v70 f41514b;

    public t70(v70 v70Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f41514b = v70Var;
        this.f41513a = d2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f41513a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new c10(this, 12), 100L);
        }
    }
}
