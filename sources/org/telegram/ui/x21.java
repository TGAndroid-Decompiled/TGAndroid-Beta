package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x21 implements r9 {
    public TLObject f51704a = null;
    public TLRPC.TL_error f51705b = null;
    public final SessionsActivity f51706c;

    public x21(SessionsActivity sessionsActivity) {
        this.f51706c = sessionsActivity;
    }

    @Override
    public final void M(String str) {
        TLObject tLObject = this.f51704a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z9 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f51706c;
            if (z9) {
                sessionsActivity.f41930e.add(0, tL_authorization);
                sessionsActivity.U = 4;
                sessionsActivity.p0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.r0();
            sessionsActivity.f41927a.f();
            sessionsActivity.f41933r.m(0L, this.f51704a, 11);
        } else if (this.f51705b != null) {
            org.telegram.messenger.g0.h3(new w21(this, 0));
        }
    }

    @Override
    public final String R0() {
        return null;
    }

    @Override
    public final boolean h1(String str, j9 j9Var) {
        this.f51704a = null;
        this.f51705b = null;
        org.telegram.messenger.g0.i3(new t21(this, str, j9Var, 2), 750L);
        return true;
    }

    @Override
    public final void V0(org.telegram.messenger.zr zrVar) {
    }

    @Override
    public final void onDismiss() {
    }
}
