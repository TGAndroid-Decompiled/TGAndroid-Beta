package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z21 implements r9 {
    public TLObject f52403a = null;
    public TLRPC.TL_error f52404b = null;
    public final SessionsActivity f52405c;

    public z21(SessionsActivity sessionsActivity) {
        this.f52405c = sessionsActivity;
    }

    @Override
    public final void M(String str) {
        TLObject tLObject = this.f52403a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z9 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f52405c;
            if (z9) {
                sessionsActivity.f41965e.add(0, tL_authorization);
                sessionsActivity.U = 4;
                sessionsActivity.p0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.r0();
            sessionsActivity.f41962a.f();
            sessionsActivity.f41968r.m(0L, this.f52403a, 11);
        } else if (this.f52404b != null) {
            org.telegram.messenger.g0.h3(new y21(this, 0));
        }
    }

    @Override
    public final String R0() {
        return null;
    }

    @Override
    public final boolean h1(String str, j9 j9Var) {
        this.f52403a = null;
        this.f52404b = null;
        org.telegram.messenger.g0.i3(new v21(this, str, j9Var, 2), 750L);
        return true;
    }

    @Override
    public final void V0(org.telegram.messenger.zr zrVar) {
    }

    @Override
    public final void onDismiss() {
    }
}
