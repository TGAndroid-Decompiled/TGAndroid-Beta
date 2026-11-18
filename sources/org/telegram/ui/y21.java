package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y21 implements s9 {
    public TLObject f53971a = null;
    public TLRPC.TL_error f53972b = null;
    public final SessionsActivity f53973c;

    public y21(SessionsActivity sessionsActivity) {
        this.f53973c = sessionsActivity;
    }

    @Override
    public final void J(String str) {
        TLObject tLObject = this.f53971a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f53973c;
            if (z10) {
                sessionsActivity.f43776e.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.p0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.r0();
            sessionsActivity.f43773a.f();
            sessionsActivity.f43779r.m(0L, this.f53971a, 11);
        } else if (this.f53972b != null) {
            org.telegram.messenger.g0.g3(new x21(this, 0));
        }
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final boolean c1(String str, j9 j9Var) {
        this.f53971a = null;
        this.f53972b = null;
        org.telegram.messenger.g0.h3(new u21(this, str, j9Var, 2), 750L);
        return true;
    }

    @Override
    public final void S0(org.telegram.messenger.ur urVar) {
    }

    @Override
    public final void onDismiss() {
    }
}
