package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class r80 implements org.telegram.messenger.bp {
    public final o60 f51543a;
    public final boolean[] f51544b;
    public final Bundle f51545c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f51546e;

    public r80(LaunchActivity launchActivity, o60 o60Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f51546e = launchActivity;
        this.f51543a = o60Var;
        this.f51544b = zArr;
        this.f51545c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.f51546e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.c5.r0((org.telegram.ui.ActionBar.g2) i5.c.h(1, launchActivity.f43085e0), null, org.telegram.messenger.hd.N0(2131748882, null), null);
        }
        try {
            this.f51543a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void f(boolean z10) {
        try {
            this.f51543a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f51544b[0]) {
            return;
        }
        bn bnVar = new bn(this.f51545c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            bnVar.f45938c6 = chatInvite;
        }
        ((ActionBarLayout) this.f51546e.M()).S(bnVar);
    }
}
