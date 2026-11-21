package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z21 implements s9 {
    public TLObject f54380a = null;
    public TLRPC.TL_error f54381b = null;
    public final SessionsActivity f54382c;

    public z21(SessionsActivity sessionsActivity) {
        this.f54382c = sessionsActivity;
    }

    @Override
    public final void J(String str) {
        TLObject tLObject = this.f54380a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f54382c;
            if (z10) {
                sessionsActivity.f43817e.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.p0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.r0();
            sessionsActivity.f43814a.f();
            sessionsActivity.f43820r.m(0L, this.f54380a, 11);
        } else if (this.f54381b != null) {
            org.telegram.messenger.g0.g3(new y21(this, 0));
        }
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final boolean c1(String str, k9 k9Var) {
        this.f54380a = null;
        this.f54381b = null;
        org.telegram.messenger.g0.h3(new v21(this, str, k9Var, 2), 750L);
        return true;
    }

    @Override
    public final void S0(org.telegram.messenger.ur urVar) {
    }

    @Override
    public final void onDismiss() {
    }
}
