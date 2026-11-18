package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class wz0 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.ej0 {
    public final r11 f53561a;

    public wz0(r11 r11Var) {
        this.f53561a = r11Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        r11 r11Var = this.f53561a;
        int i10 = r11Var.W;
        ConnectionsManager.getInstance(i10).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i10);
        ArrayList[] arrayListArr = d02.F0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        d02.E0[0] = 0;
        d02.getMessagesStorage().f27054a.c(new org.telegram.messenger.eg(d02, 9));
        ArrayList arrayList2 = arrayListArr[0];
        r11Var.B(false, true, true);
    }

    @Override
    public void i() {
        this.f53561a.m();
    }
}
