package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u81 implements t9 {
    public TLObject f37157a = null;
    public TLRPC.TL_error f37158b = null;
    public final SessionsActivity f37159c;

    public u81(SessionsActivity sessionsActivity) {
        this.f37159c = sessionsActivity;
    }

    @Override
    public final void J(String str) {
        TLObject tLObject = this.f37157a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f37159c;
            if (z10) {
                sessionsActivity.f30611f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f30608a.l();
            sessionsActivity.f30614s.m(0L, this.f37157a, 11);
        } else if (this.f37158b != null) {
            AndroidUtilities.runOnUIThread(new t81(this, 0));
        }
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final boolean e1(String str, l9 l9Var) {
        this.f37157a = null;
        this.f37158b = null;
        AndroidUtilities.runOnUIThread(new pf0(this, str, l9Var, 29), 750L);
        return true;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
