package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class vi implements NotificationCenter.NotificationCenterDelegate {
    public final int f38723a;
    public final ai.c9 f38724b;
    public final wn f38725c;
    public final wn d;

    public vi(wn wnVar, int i10, ai.c9 c9Var, wn wnVar2) {
        this.d = wnVar;
        this.f38723a = i10;
        this.f38724b = c9Var;
        this.f38725c = wnVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f38723a) {
            this.f38724b.run();
            AndroidUtilities.runOnUIThread(new i2.a0(this.f38725c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.m2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
