package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class sa0 implements MessagesController.MessagesLoadedCallback {
    public final v10 f41177a;
    public final boolean[] f41178b;
    public final Bundle f41179c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f41180e;

    public sa0(LaunchActivity launchActivity, v10 v10Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f41180e = launchActivity;
        this.f41177a = v10Var;
        this.f41178b = zArr;
        this.f41179c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f41180e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.z4.u0((org.telegram.ui.ActionBar.p2) l.d.i(1, launchActivity.f34136a0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f41177a.run();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z4) {
        try {
            this.f41177a.run();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (this.f41178b[0]) {
            return;
        }
        xn xnVar = new xn(this.f41179c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            xnVar.H5 = chatInvite;
        }
        ((ActionBarLayout) this.f41180e.O()).P(xnVar);
    }
}
