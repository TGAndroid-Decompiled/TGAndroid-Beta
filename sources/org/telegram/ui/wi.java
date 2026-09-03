package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class wi implements NotificationCenter.NotificationCenterDelegate {
    public final int f39707a;
    public final cg.v1 f39708b;
    public final zn f39709c;
    public final zn d;

    public wi(zn znVar, int i10, cg.v1 v1Var, zn znVar2) {
        this.d = znVar;
        this.f39707a = i10;
        this.f39708b = v1Var;
        this.f39709c = znVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f39707a) {
            this.f39708b.run();
            AndroidUtilities.runOnUIThread(new j3.b0(this.f39709c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.p2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
