package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class r80 implements org.telegram.messenger.ep {
    public final f10 f49312a;
    public final boolean[] f49313b;
    public final Bundle f49314c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f49315e;

    public r80(LaunchActivity launchActivity, f10 f10Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f49315e = launchActivity;
        this.f49312a = f10Var;
        this.f49313b = zArr;
        this.f49314c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.f49315e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.u4.r0((org.telegram.ui.ActionBar.f2) jg.g.i(1, launchActivity.f41258d0), null, org.telegram.messenger.id.M0(2131749075, null), null);
        }
        try {
            this.f49312a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void f(boolean z9) {
        try {
            this.f49312a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f49313b[0]) {
            return;
        }
        cn cnVar = new cn(this.f49314c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            cnVar.f44424a6 = chatInvite;
        }
        ((ActionBarLayout) this.f49315e.M()).S(cnVar);
    }
}
