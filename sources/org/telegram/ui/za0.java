package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class za0 implements MessagesController.MessagesLoadedCallback {
    public final h90 f43734a;
    public final boolean[] f43735b;
    public final Bundle f43736c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f43737e;

    public za0(LaunchActivity launchActivity, h90 h90Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f43737e = launchActivity;
        this.f43734a = h90Var;
        this.f43735b = zArr;
        this.f43736c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f43737e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.n2) hg.k0.g(1, launchActivity.f33774d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f43734a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f43734a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (this.f43735b[0]) {
            return;
        }
        yn ynVar = new yn(this.f43736c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            ynVar.I5 = chatInvite;
        }
        ((ActionBarLayout) this.f43737e.O()).P(ynVar);
    }
}
