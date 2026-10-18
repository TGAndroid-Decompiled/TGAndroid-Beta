package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ri implements NotificationCenter.NotificationCenterDelegate {
    public final int f40738a;
    public final ai.cb f40739b;
    public final sn f40740c;
    public final sn d;

    public ri(sn snVar, int i10, ai.cb cbVar, sn snVar2) {
        this.d = snVar;
        this.f40738a = i10;
        this.f40739b = cbVar;
        this.f40740c = snVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f40738a) {
            this.f40739b.run();
            AndroidUtilities.runOnUIThread(new i2.z(this.f40740c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.n2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
