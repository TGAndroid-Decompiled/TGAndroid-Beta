package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ti implements NotificationCenter.NotificationCenterDelegate {
    public final int f43656a;
    public final ai.h1 f43657b;
    public final wn f43658c;
    public final wn d;

    public ti(wn wnVar, int i10, ai.h1 h1Var, wn wnVar2) {
        this.d = wnVar;
        this.f43656a = i10;
        this.f43657b = h1Var;
        this.f43658c = wnVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f43656a) {
            this.f43657b.run();
            AndroidUtilities.runOnUIThread(new i2.b0(this.f43658c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.r2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
