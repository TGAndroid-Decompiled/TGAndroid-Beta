package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ta0 implements MessagesController.MessagesLoadedCallback {
    public final w10 f38443a;
    public final boolean[] f38444b;
    public final Bundle f38445c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public ta0(LaunchActivity launchActivity, w10 w10Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f38443a = w10Var;
        this.f38444b = zArr;
        this.f38445c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.z4.u0((org.telegram.ui.ActionBar.p2) kf.k0.i(1, launchActivity.f31588a0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f38443a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z4) {
        try {
            this.f38443a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f38444b[0]) {
            return;
        }
        zn znVar = new zn(this.f38445c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            znVar.H5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(znVar);
    }
}
