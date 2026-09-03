package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ui implements NotificationCenter.NotificationCenterDelegate {
    public final int f41843a;
    public final dg.u1 f41844b;
    public final xn f41845c;
    public final xn d;

    public ui(xn xnVar, int i10, dg.u1 u1Var, xn xnVar2) {
        this.d = xnVar;
        this.f41843a = i10;
        this.f41844b = u1Var;
        this.f41845c = xnVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f41843a) {
            this.f41844b.run();
            AndroidUtilities.runOnUIThread(new j3.b0(this.f41845c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.p2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
