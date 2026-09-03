package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class z41 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.xk0 {
    public final x61 f40396a;

    public z41(x61 x61Var) {
        this.f40396a = x61Var;
    }

    @Override
    public void e() {
        this.f40396a.m();
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        x61 x61Var = this.f40396a;
        int i11 = x61Var.S;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        x61Var.B(false, true, true);
    }
}
