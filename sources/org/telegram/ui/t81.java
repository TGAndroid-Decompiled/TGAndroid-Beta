package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t81 implements u9 {
    public TLObject f41955a = null;
    public TLRPC.TL_error f41956b = null;
    public final SessionsActivity f41957c;

    public t81(SessionsActivity sessionsActivity) {
        this.f41957c = sessionsActivity;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f41955a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f41957c;
            if (z10) {
                sessionsActivity.f34515f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.f34514e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f34511a.l();
            sessionsActivity.f34518s.m(0L, this.f41955a, 11);
        } else if (this.f41956b != null) {
            AndroidUtilities.runOnUIThread(new s81(this, 0));
        }
    }

    @Override
    public final boolean Z0(String str, k9 k9Var) {
        this.f41955a = null;
        this.f41956b = null;
        AndroidUtilities.runOnUIThread(new of0(this, str, k9Var, 29), 750L);
        return true;
    }

    @Override
    public final String z0() {
        return null;
    }

    @Override
    public final void P0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
