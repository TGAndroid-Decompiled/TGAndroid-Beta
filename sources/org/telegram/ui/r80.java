package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class r80 implements org.telegram.messenger.ap {
    public final h60 f51508a;
    public final boolean[] f51509b;
    public final Bundle f51510c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f51511e;

    public r80(LaunchActivity launchActivity, h60 h60Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f51511e = launchActivity;
        this.f51508a = h60Var;
        this.f51509b = zArr;
        this.f51510c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.f51511e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.c5.r0((org.telegram.ui.ActionBar.g2) i5.c.h(1, launchActivity.f43116e0), null, org.telegram.messenger.gd.N0(2131748882, null), null);
        }
        try {
            this.f51508a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void f(boolean z10) {
        try {
            this.f51508a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f51509b[0]) {
            return;
        }
        bn bnVar = new bn(this.f51510c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            bnVar.f45981c6 = chatInvite;
        }
        ((ActionBarLayout) this.f51511e.M()).S(bnVar);
    }
}
