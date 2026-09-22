package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class yi implements NotificationCenter.NotificationCenterDelegate {
    public final int f39967a;
    public final ai.c9 f39968b;
    public final zn f39969c;
    public final zn d;

    public yi(zn znVar, int i10, ai.c9 c9Var, zn znVar2) {
        this.d = znVar;
        this.f39967a = i10;
        this.f39968b = c9Var;
        this.f39969c = znVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f39967a) {
            this.f39968b.run();
            AndroidUtilities.runOnUIThread(new i2.z(this.f39969c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.n2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
