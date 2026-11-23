package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class vz0 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.gj0 {
    public final q11 f53058a;

    public vz0(q11 q11Var) {
        this.f53058a = q11Var;
    }

    @Override
    public void f() {
        this.f53058a.m();
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        q11 q11Var = this.f53058a;
        int i10 = q11Var.W;
        ConnectionsManager.getInstance(i10).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i10);
        ArrayList[] arrayListArr = d02.F0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        d02.E0[0] = 0;
        d02.getMessagesStorage().f27149a.c(new org.telegram.messenger.eg(d02, 9));
        ArrayList arrayList2 = arrayListArr[0];
        q11Var.B(false, true, true);
    }
}
