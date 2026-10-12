package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v81 implements x9 {
    public TLObject f42716a = null;
    public TLRPC.TL_error f42717b = null;
    public final SessionsActivity f42718c;

    public v81(SessionsActivity sessionsActivity) {
        this.f42718c = sessionsActivity;
    }

    @Override
    public final String A0() {
        return null;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f42716a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f42718c;
            if (z10) {
                sessionsActivity.f34316f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.f34315e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f34312a.l();
            sessionsActivity.f34319s.m(0L, this.f42716a, 11);
        } else if (this.f42717b != null) {
            AndroidUtilities.runOnUIThread(new u81(this, 0));
        }
    }

    @Override
    public final boolean Z0(String str, n9 n9Var) {
        this.f42716a = null;
        this.f42717b = null;
        AndroidUtilities.runOnUIThread(new pf0(this, str, n9Var, 29), 750L);
        return true;
    }

    @Override
    public final void P0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
