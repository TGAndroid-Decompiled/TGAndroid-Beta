package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class u41 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.zk0 {
    public final r61 f41787a;

    public u41(r61 r61Var) {
        this.f41787a = r61Var;
    }

    @Override
    public void d() {
        this.f41787a.m();
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        r61 r61Var = this.f41787a;
        int i11 = r61Var.S;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        r61Var.B(false, true, true);
    }
}
