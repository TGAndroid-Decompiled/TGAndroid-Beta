package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class xi implements NotificationCenter.NotificationCenterDelegate {
    public final int f39591a;
    public final ai.c9 f39592b;
    public final zn f39593c;
    public final zn d;

    public xi(zn znVar, int i10, ai.c9 c9Var, zn znVar2) {
        this.d = znVar;
        this.f39591a = i10;
        this.f39592b = c9Var;
        this.f39593c = znVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f39591a) {
            this.f39592b.run();
            AndroidUtilities.runOnUIThread(new i2.z(this.f39593c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.n2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
