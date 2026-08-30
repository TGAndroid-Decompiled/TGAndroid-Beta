package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class s41 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.yk0 {
    public final q61 f38194a;

    public s41(q61 q61Var) {
        this.f38194a = q61Var;
    }

    @Override
    public void d() {
        this.f38194a.m();
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        q61 q61Var = this.f38194a;
        int i11 = q61Var.S;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        q61Var.B(false, true, true);
    }
}
