package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class s90 implements org.telegram.messenger.jp {
    public final f70 f41418a;
    public final boolean[] f41419b;
    public final Bundle f41420c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public s90(LaunchActivity launchActivity, f70 f70Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f41418a = f70Var;
        this.f41419b = zArr;
        this.f41420c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.s4.t0((org.telegram.ui.ActionBar.k2) i0.a.g(1, launchActivity.f33353d0), null, org.telegram.messenger.cd.L0(2131749085, null), null);
        }
        try {
            this.f41418a.run();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void g(boolean z10) {
        try {
            this.f41418a.run();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (this.f41419b[0]) {
            return;
        }
        un unVar = new un(this.f41420c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            unVar.f42184a6 = chatInvite;
        }
        ((ActionBarLayout) this.e.M()).R(unVar);
    }
}
