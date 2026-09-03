package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class sa0 implements MessagesController.MessagesLoadedCallback {
    public final z10 f41083a;
    public final boolean[] f41084b;
    public final Bundle f41085c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f41086e;

    public sa0(LaunchActivity launchActivity, z10 z10Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f41086e = launchActivity;
        this.f41083a = z10Var;
        this.f41084b = zArr;
        this.f41085c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f41086e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.z4.u0((org.telegram.ui.ActionBar.p2) l.d.i(1, launchActivity.f34136a0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f41083a.run();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z4) {
        try {
            this.f41083a.run();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (this.f41084b[0]) {
            return;
        }
        xn xnVar = new xn(this.f41085c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            xnVar.H5 = chatInvite;
        }
        ((ActionBarLayout) this.f41086e.O()).P(xnVar);
    }
}
