package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t81 implements u9 {
    public TLObject f41911a = null;
    public TLRPC.TL_error f41912b = null;
    public final SessionsActivity f41913c;

    public t81(SessionsActivity sessionsActivity) {
        this.f41913c = sessionsActivity;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f41911a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f41913c;
            if (z10) {
                sessionsActivity.f34477f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.f34476e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f34473a.l();
            sessionsActivity.f34480s.m(0L, this.f41911a, 11);
        } else if (this.f41912b != null) {
            AndroidUtilities.runOnUIThread(new s81(this, 0));
        }
    }

    @Override
    public final boolean Z0(String str, k9 k9Var) {
        this.f41911a = null;
        this.f41912b = null;
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
