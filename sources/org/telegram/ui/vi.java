package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class vi implements NotificationCenter.NotificationCenterDelegate {
    public final int f38403a;
    public final ai.c9 f38404b;
    public final xn f38405c;
    public final xn d;

    public vi(xn xnVar, int i10, ai.c9 c9Var, xn xnVar2) {
        this.d = xnVar;
        this.f38403a = i10;
        this.f38404b = c9Var;
        this.f38405c = xnVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f38403a) {
            this.f38404b.run();
            AndroidUtilities.runOnUIThread(new i2.a0(this.f38405c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.n2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
