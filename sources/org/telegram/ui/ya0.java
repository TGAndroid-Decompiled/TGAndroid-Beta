package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ya0 implements MessagesController.MessagesLoadedCallback {
    public final n70 f44327a;
    public final boolean[] f44328b;
    public final Bundle f44329c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f44330e;

    public ya0(LaunchActivity launchActivity, n70 n70Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f44330e = launchActivity;
        this.f44327a = n70Var;
        this.f44328b = zArr;
        this.f44329c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f44330e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.m2) hg.c.g(1, launchActivity.f33845d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f44327a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f44327a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (this.f44328b[0]) {
            return;
        }
        zn znVar = new zn(this.f44329c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            znVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.f44330e.O()).P(znVar);
    }
}
