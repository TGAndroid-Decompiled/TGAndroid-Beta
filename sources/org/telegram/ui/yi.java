package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class yi implements NotificationCenter.NotificationCenterDelegate {
    public final int f39915a;
    public final ai.c9 f39916b;
    public final bo f39917c;
    public final bo d;

    public yi(bo boVar, int i10, ai.c9 c9Var, bo boVar2) {
        this.d = boVar;
        this.f39915a = i10;
        this.f39916b = c9Var;
        this.f39917c = boVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f39915a) {
            this.f39916b.run();
            AndroidUtilities.runOnUIThread(new i2.z(this.f39917c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.n2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
