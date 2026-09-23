package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class wa0 implements MessagesController.MessagesLoadedCallback {
    public final ia0 f38581a;
    public final boolean[] f38582b;
    public final Bundle f38583c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public wa0(LaunchActivity launchActivity, ia0 ia0Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f38581a = ia0Var;
        this.f38582b = zArr;
        this.f38583c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.n2) hg.c.h(1, launchActivity.f30791d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f38581a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f38581a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f38582b[0]) {
            return;
        }
        xn xnVar = new xn(this.f38583c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            xnVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(xnVar);
    }
}
