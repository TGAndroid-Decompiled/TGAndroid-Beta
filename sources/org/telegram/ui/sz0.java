package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class sz0 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.vi0 {
    public final n11 f51307a;

    public sz0(n11 n11Var) {
        this.f51307a = n11Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        n11 n11Var = this.f51307a;
        int i10 = n11Var.W;
        ConnectionsManager.getInstance(i10).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i10);
        ArrayList[] arrayListArr = b02.F0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        b02.E0[0] = 0;
        b02.getMessagesStorage().f27220a.c(new org.telegram.messenger.eg(b02, 8));
        ArrayList arrayList2 = arrayListArr[0];
        n11Var.B(false, true, true);
    }

    @Override
    public void i() {
        this.f51307a.m();
    }
}
