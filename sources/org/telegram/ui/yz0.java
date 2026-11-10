package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class yz0 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.qi0 {
    public final t11 f52153a;

    public yz0(t11 t11Var) {
        this.f52153a = t11Var;
    }

    @Override
    public void e() {
        this.f52153a.m();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        t11 t11Var = this.f52153a;
        int i10 = t11Var.V;
        ConnectionsManager.getInstance(i10).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i10);
        ArrayList[] arrayListArr = b02.E0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        b02.D0[0] = 0;
        b02.getMessagesStorage().f26723a.c(new org.telegram.messenger.fg(b02, 8));
        ArrayList arrayList2 = arrayListArr[0];
        t11Var.B(false, true, true);
    }
}
