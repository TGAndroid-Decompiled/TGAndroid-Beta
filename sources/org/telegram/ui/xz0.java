package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class xz0 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.ri0 {
    public final s11 f51796a;

    public xz0(s11 s11Var) {
        this.f51796a = s11Var;
    }

    @Override
    public void e() {
        this.f51796a.m();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        s11 s11Var = this.f51796a;
        int i10 = s11Var.V;
        ConnectionsManager.getInstance(i10).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i10);
        ArrayList[] arrayListArr = b02.E0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        b02.D0[0] = 0;
        b02.getMessagesStorage().f26719a.c(new org.telegram.messenger.fg(b02, 8));
        ArrayList arrayList2 = arrayListArr[0];
        s11Var.B(false, true, true);
    }
}
