package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class xi implements NotificationCenter.NotificationCenterDelegate {
    public final int f39498a;
    public final ai.c9 f39499b;
    public final zn f39500c;
    public final zn d;

    public xi(zn znVar, int i10, ai.c9 c9Var, zn znVar2) {
        this.d = znVar;
        this.f39498a = i10;
        this.f39499b = c9Var;
        this.f39500c = znVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f39498a) {
            this.f39499b.run();
            AndroidUtilities.runOnUIThread(new i2.z(this.f39500c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.n2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
