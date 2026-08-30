package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ra0 implements MessagesController.MessagesLoadedCallback {
    public final g00 f37959a;
    public final boolean[] f37960b;
    public final Bundle f37961c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public ra0(LaunchActivity launchActivity, g00 g00Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f37959a = g00Var;
        this.f37960b = zArr;
        this.f37961c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.z4.u0((org.telegram.ui.ActionBar.p2) kh.a2.i(1, launchActivity.f31614a0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f37959a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z4) {
        try {
            this.f37959a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f37960b[0]) {
            return;
        }
        xn xnVar = new xn(this.f37961c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            xnVar.H5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(xnVar);
    }
}
