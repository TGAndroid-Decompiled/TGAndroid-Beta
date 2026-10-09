package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class z70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.b2 f44503a;
    public final d80 f44504b;

    public z70(d80 d80Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f44504b = d80Var;
        this.f44503a = b2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f44503a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new uz(this, 13), 100L);
        }
    }
}
