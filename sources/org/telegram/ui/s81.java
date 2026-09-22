package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s81 implements u9 {
    public TLObject f37359a = null;
    public TLRPC.TL_error f37360b = null;
    public final SessionsActivity f37361c;

    public s81(SessionsActivity sessionsActivity) {
        this.f37361c = sessionsActivity;
    }

    @Override
    public final String I0() {
        return null;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f37359a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f37361c;
            if (z10) {
                sessionsActivity.f31804f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f31801a.l();
            sessionsActivity.f31807s.m(0L, this.f37359a, 11);
        } else if (this.f37360b != null) {
            AndroidUtilities.runOnUIThread(new r81(this, 0));
        }
    }

    @Override
    public final boolean e1(String str, m9 m9Var) {
        this.f37359a = null;
        this.f37360b = null;
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
