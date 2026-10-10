package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class za0 implements MessagesController.MessagesLoadedCallback {
    public final m70 f44567a;
    public final boolean[] f44568b;
    public final Bundle f44569c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f44570e;

    public za0(LaunchActivity launchActivity, m70 m70Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f44570e = launchActivity;
        this.f44567a = m70Var;
        this.f44568b = zArr;
        this.f44569c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f44570e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.n2) hg.c.g(1, launchActivity.f33821d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f44567a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f44567a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (this.f44568b[0]) {
            return;
        }
        zn znVar = new zn(this.f44569c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            znVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.f44570e.O()).P(znVar);
    }
}
