package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class zi implements NotificationCenter.NotificationCenterDelegate {
    public final int f40256a;
    public final ai.c9 f40257b;
    public final bo f40258c;
    public final bo d;

    public zi(bo boVar, int i10, ai.c9 c9Var, bo boVar2) {
        this.d = boVar;
        this.f40256a = i10;
        this.f40257b = c9Var;
        this.f40258c = boVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f40256a) {
            this.f40257b.run();
            AndroidUtilities.runOnUIThread(new i2.z(this.f40258c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.o2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
