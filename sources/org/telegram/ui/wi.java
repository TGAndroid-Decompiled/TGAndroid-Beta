package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class wi implements NotificationCenter.NotificationCenterDelegate {
    public final int f42499a;
    public final ai.c9 f42500b;
    public final yn f42501c;
    public final yn d;

    public wi(yn ynVar, int i10, ai.c9 c9Var, yn ynVar2) {
        this.d = ynVar;
        this.f42499a = i10;
        this.f42500b = c9Var;
        this.f42501c = ynVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f42499a) {
            this.f42500b.run();
            AndroidUtilities.runOnUIThread(new i2.a0(this.f42501c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.n2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
