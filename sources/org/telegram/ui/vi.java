package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class vi implements NotificationCenter.NotificationCenterDelegate {
    public final int f38724a;
    public final ai.c9 f38725b;
    public final wn f38726c;
    public final wn d;

    public vi(wn wnVar, int i10, ai.c9 c9Var, wn wnVar2) {
        this.d = wnVar;
        this.f38724a = i10;
        this.f38725b = c9Var;
        this.f38726c = wnVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f38724a) {
            this.f38725b.run();
            AndroidUtilities.runOnUIThread(new i2.a0(this.f38726c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.m2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
