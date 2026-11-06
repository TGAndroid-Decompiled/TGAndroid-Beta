package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class uz0 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.qi0 {
    public final q11 f50524a;

    public uz0(q11 q11Var) {
        this.f50524a = q11Var;
    }

    @Override
    public void e() {
        this.f50524a.m();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        q11 q11Var = this.f50524a;
        int i10 = q11Var.V;
        ConnectionsManager.getInstance(i10).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i10);
        ArrayList[] arrayListArr = b02.E0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        b02.D0[0] = 0;
        b02.getMessagesStorage().f26688a.c(new org.telegram.messenger.fg(b02, 8));
        ArrayList arrayList2 = arrayListArr[0];
        q11Var.B(false, true, true);
    }
}
