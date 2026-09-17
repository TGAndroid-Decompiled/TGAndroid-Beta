package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class yi implements NotificationCenter.NotificationCenterDelegate {
    public final int f43155a;
    public final bi.k8 f43156b;
    public final co f43157c;
    public final co d;

    public yi(co coVar, int i10, bi.k8 k8Var, co coVar2) {
        this.d = coVar;
        this.f43155a = i10;
        this.f43156b = k8Var;
        this.f43157c = coVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f43155a) {
            this.f43156b.run();
            AndroidUtilities.runOnUIThread(new i2.a0(this.f43157c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.n2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
