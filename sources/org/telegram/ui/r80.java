package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class r80 implements org.telegram.messenger.ap {
    public final o60 f51519a;
    public final boolean[] f51520b;
    public final Bundle f51521c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f51522e;

    public r80(LaunchActivity launchActivity, o60 o60Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f51522e = launchActivity;
        this.f51519a = o60Var;
        this.f51520b = zArr;
        this.f51521c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.f51522e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.b5.r0((org.telegram.ui.ActionBar.h2) i5.c.h(1, launchActivity.f43075e0), null, org.telegram.messenger.gd.M0(2131748883, null), null);
        }
        try {
            this.f51519a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void f(boolean z10) {
        try {
            this.f51519a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f51520b[0]) {
            return;
        }
        bn bnVar = new bn(this.f51521c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            bnVar.f45958c6 = chatInvite;
        }
        ((ActionBarLayout) this.f51522e.M()).S(bnVar);
    }
}
