package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class z41 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.yk0 {
    public final w61 f43797a;

    public z41(w61 w61Var) {
        this.f43797a = w61Var;
    }

    @Override
    public void d() {
        this.f43797a.m();
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        w61 w61Var = this.f43797a;
        int i11 = w61Var.S;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        w61Var.B(false, true, true);
    }
}
