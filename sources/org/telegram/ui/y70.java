package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class y70 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.c2 f40151a;
    public final b80 f40152b;

    public y70(b80 b80Var, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f40152b = b80Var;
        this.f40151a = c2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.f40151a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new f10(this, 12), 100L);
        }
    }
}
