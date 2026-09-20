package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s81 implements u9 {
    public TLObject f37337a = null;
    public TLRPC.TL_error f37338b = null;
    public final SessionsActivity f37339c;

    public s81(SessionsActivity sessionsActivity) {
        this.f37339c = sessionsActivity;
    }

    @Override
    public final String I0() {
        return null;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f37337a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f37339c;
            if (z10) {
                sessionsActivity.f31783f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f31780a.l();
            sessionsActivity.f31786s.m(0L, this.f37337a, 11);
        } else if (this.f37338b != null) {
            AndroidUtilities.runOnUIThread(new r81(this, 0));
        }
    }

    @Override
    public final boolean e1(String str, m9 m9Var) {
        this.f37337a = null;
        this.f37338b = null;
        AndroidUtilities.runOnUIThread(new rf0(this, str, m9Var, 29), 750L);
        return true;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
