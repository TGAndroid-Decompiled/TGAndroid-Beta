package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class r90 implements org.telegram.messenger.kp {
    public final y60 f41014a;
    public final boolean[] f41015b;
    public final Bundle f41016c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public r90(LaunchActivity launchActivity, y60 y60Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f41014a = y60Var;
        this.f41015b = zArr;
        this.f41016c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.s4.t0((org.telegram.ui.ActionBar.k2) i0.a.g(1, launchActivity.f33360d0), null, org.telegram.messenger.dd.L0(2131749085, null), null);
        }
        try {
            this.f41014a.run();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void g(boolean z10) {
        try {
            this.f41014a.run();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (this.f41015b[0]) {
            return;
        }
        un unVar = new un(this.f41016c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            unVar.f41994a6 = chatInvite;
        }
        ((ActionBarLayout) this.e.M()).R(unVar);
    }
}
