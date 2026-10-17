package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ri implements NotificationCenter.NotificationCenterDelegate {
    public final int f40749a;
    public final ai.bb f40750b;
    public final sn f40751c;
    public final sn d;

    public ri(sn snVar, int i10, ai.bb bbVar, sn snVar2) {
        this.d = snVar;
        this.f40749a = i10;
        this.f40750b = bbVar;
        this.f40751c = snVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f40749a) {
            this.f40750b.run();
            AndroidUtilities.runOnUIThread(new i2.y(this.f40751c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.n2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
