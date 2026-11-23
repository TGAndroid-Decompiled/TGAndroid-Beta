package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x21 implements s9 {
    public TLObject f53827a = null;
    public TLRPC.TL_error f53828b = null;
    public final SessionsActivity f53829c;

    public x21(SessionsActivity sessionsActivity) {
        this.f53829c = sessionsActivity;
    }

    @Override
    public final void H(String str) {
        TLObject tLObject = this.f53827a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f53829c;
            if (z10) {
                sessionsActivity.f43902e.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.p0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.r0();
            sessionsActivity.f43899a.f();
            sessionsActivity.f43905r.m(0L, this.f53827a, 11);
        } else if (this.f53828b != null) {
            org.telegram.messenger.g0.g3(new w21(this, 0));
        }
    }

    @Override
    public final boolean Z0(String str, k9 k9Var) {
        this.f53827a = null;
        this.f53828b = null;
        org.telegram.messenger.g0.h3(new t21(this, str, k9Var, 2), 750L);
        return true;
    }

    @Override
    public final String w0() {
        return null;
    }

    @Override
    public final void E0(org.telegram.messenger.ur urVar) {
    }

    @Override
    public final void onDismiss() {
    }
}
