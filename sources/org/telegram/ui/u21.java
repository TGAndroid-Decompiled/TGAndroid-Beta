package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u21 implements s9 {
    public TLObject f51725a = null;
    public TLRPC.TL_error f51726b = null;
    public final SessionsActivity f51727c;

    public u21(SessionsActivity sessionsActivity) {
        this.f51727c = sessionsActivity;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void M(String str) {
        TLObject tLObject = this.f51725a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f51727c;
            if (z10) {
                sessionsActivity.f43330e.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.p0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.r0();
            sessionsActivity.f43327a.f();
            sessionsActivity.f43333r.m(0L, this.f51725a, 11);
        } else if (this.f51726b != null) {
            org.telegram.messenger.g0.h3(new t21(this, 0));
        }
    }

    @Override
    public final boolean d1(String str, j9 j9Var) {
        this.f51725a = null;
        this.f51726b = null;
        org.telegram.messenger.g0.i3(new q21(this, str, j9Var, 2), 750L);
        return true;
    }

    @Override
    public final void S0(org.telegram.messenger.wr wrVar) {
    }

    @Override
    public final void onDismiss() {
    }
}
