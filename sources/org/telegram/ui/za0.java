package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class za0 implements MessagesController.MessagesLoadedCallback {
    public final h90 f43741a;
    public final boolean[] f43742b;
    public final Bundle f43743c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f43744e;

    public za0(LaunchActivity launchActivity, h90 h90Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f43744e = launchActivity;
        this.f43741a = h90Var;
        this.f43742b = zArr;
        this.f43743c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f43744e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.n2) hg.c.g(1, launchActivity.f33780d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f43741a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f43741a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (this.f43742b[0]) {
            return;
        }
        yn ynVar = new yn(this.f43743c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            ynVar.I5 = chatInvite;
        }
        ((ActionBarLayout) this.f43744e.O()).P(ynVar);
    }
}
