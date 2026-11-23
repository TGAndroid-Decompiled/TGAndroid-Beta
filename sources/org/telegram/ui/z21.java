package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z21 implements s9 {
    public TLObject f54384a = null;
    public TLRPC.TL_error f54385b = null;
    public final SessionsActivity f54386c;

    public z21(SessionsActivity sessionsActivity) {
        this.f54386c = sessionsActivity;
    }

    @Override
    public final void J(String str) {
        TLObject tLObject = this.f54384a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f54386c;
            if (z10) {
                sessionsActivity.f43821e.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.p0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.r0();
            sessionsActivity.f43818a.f();
            sessionsActivity.f43824r.m(0L, this.f54384a, 11);
        } else if (this.f54385b != null) {
            org.telegram.messenger.g0.g3(new y21(this, 0));
        }
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final boolean c1(String str, k9 k9Var) {
        this.f54384a = null;
        this.f54385b = null;
        org.telegram.messenger.g0.h3(new v21(this, str, k9Var, 2), 750L);
        return true;
    }

    @Override
    public final void S0(org.telegram.messenger.vr vrVar) {
    }

    @Override
    public final void onDismiss() {
    }
}
