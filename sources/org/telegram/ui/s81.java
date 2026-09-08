package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s81 implements t9 {
    public TLObject f40375a = null;
    public TLRPC.TL_error f40376b = null;
    public final SessionsActivity f40377c;

    public s81(SessionsActivity sessionsActivity) {
        this.f40377c = sessionsActivity;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f40375a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f40377c;
            if (z10) {
                sessionsActivity.f34149f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.f34148e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f34145a.l();
            sessionsActivity.f34152s.m(0L, this.f40375a, 11);
        } else if (this.f40376b != null) {
            AndroidUtilities.runOnUIThread(new r81(this, 0));
        }
    }

    @Override
    public final String K0() {
        return null;
    }

    @Override
    public final boolean f1(String str, l9 l9Var) {
        this.f40375a = null;
        this.f40376b = null;
        AndroidUtilities.runOnUIThread(new pf0(this, str, l9Var, 29), 750L);
        return true;
    }

    @Override
    public final void W0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
