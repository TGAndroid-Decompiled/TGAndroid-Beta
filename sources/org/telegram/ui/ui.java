package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ui implements NotificationCenter.NotificationCenterDelegate {
    public final int f38948a;
    public final cg.v1 f38949b;
    public final xn f38950c;
    public final xn d;

    public ui(xn xnVar, int i10, cg.v1 v1Var, xn xnVar2) {
        this.d = xnVar;
        this.f38948a = i10;
        this.f38949b = v1Var;
        this.f38950c = xnVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f38948a) {
            this.f38949b.run();
            AndroidUtilities.runOnUIThread(new j3.b0(this.f38950c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.p2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
