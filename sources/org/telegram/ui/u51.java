package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class u51 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ol0 {
    public final r71 f40270a;

    public u51(r71 r71Var) {
        this.f40270a = r71Var;
    }

    @Override
    public void c() {
        this.f40270a.m();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        r71 r71Var = this.f40270a;
        int i11 = r71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        r71Var.B(false, true, true);
    }
}
