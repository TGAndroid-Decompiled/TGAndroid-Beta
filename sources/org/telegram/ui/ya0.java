package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ya0 implements MessagesController.MessagesLoadedCallback {
    public final ea0 f40174a;
    public final boolean[] f40175b;
    public final Bundle f40176c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public ya0(LaunchActivity launchActivity, ea0 ea0Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f40174a = ea0Var;
        this.f40175b = zArr;
        this.f40176c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.o2) hg.k0.g(1, launchActivity.f31108d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f40174a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f40174a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f40175b[0]) {
            return;
        }
        xn xnVar = new xn(this.f40176c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            xnVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(xnVar);
    }
}
