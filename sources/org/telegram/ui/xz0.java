package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class xz0 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.gj0 {
    public final s11 f53991a;

    public xz0(s11 s11Var) {
        this.f53991a = s11Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        s11 s11Var = this.f53991a;
        int i10 = s11Var.W;
        ConnectionsManager.getInstance(i10).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i10);
        ArrayList[] arrayListArr = d02.F0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        d02.E0[0] = 0;
        d02.getMessagesStorage().f27250a.c(new org.telegram.messenger.fg(d02, 9));
        ArrayList arrayList2 = arrayListArr[0];
        s11Var.B(false, true, true);
    }

    @Override
    public void i() {
        this.f53991a.m();
    }
}
