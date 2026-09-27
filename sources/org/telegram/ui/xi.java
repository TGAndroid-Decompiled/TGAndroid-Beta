package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class xi implements NotificationCenter.NotificationCenterDelegate {
    public final int f39662a;
    public final ai.c9 f39663b;
    public final xn f39664c;
    public final xn d;

    public xi(xn xnVar, int i10, ai.c9 c9Var, xn xnVar2) {
        this.d = xnVar;
        this.f39662a = i10;
        this.f39663b = c9Var;
        this.f39664c = xnVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f39662a) {
            this.f39663b.run();
            AndroidUtilities.runOnUIThread(new i2.a0(this.f39664c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.o2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
