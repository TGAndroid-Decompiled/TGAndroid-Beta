package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class va0 implements MessagesController.MessagesLoadedCallback {
    public final n80 f38673a;
    public final boolean[] f38674b;
    public final Bundle f38675c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public va0(LaunchActivity launchActivity, n80 n80Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f38673a = n80Var;
        this.f38674b = zArr;
        this.f38675c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.m2) hg.c.g(1, launchActivity.f31105d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f38673a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f38673a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f38674b[0]) {
            return;
        }
        wn wnVar = new wn(this.f38675c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            wnVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(wnVar);
    }
}
