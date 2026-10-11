package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class yi implements NotificationCenter.NotificationCenterDelegate {
    public final int f44472a;
    public final ai.d9 f44473b;
    public final zn f44474c;
    public final zn d;

    public yi(zn znVar, int i10, ai.d9 d9Var, zn znVar2) {
        this.d = znVar;
        this.f44472a = i10;
        this.f44473b = d9Var;
        this.f44474c = znVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f44472a) {
            this.f44473b.run();
            AndroidUtilities.runOnUIThread(new i2.a0(this.f44474c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.m2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
