package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z81 implements y9 {
    public TLObject f42218a = null;
    public TLRPC.TL_error f42219b = null;
    public final SessionsActivity f42220c;

    public z81(SessionsActivity sessionsActivity) {
        this.f42220c = sessionsActivity;
    }

    @Override
    public final String I0() {
        return null;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f42218a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f42220c;
            if (z10) {
                sessionsActivity.f32492f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f32489a.l();
            sessionsActivity.f32495s.m(0L, this.f42218a, 11);
        } else if (this.f42219b != null) {
            AndroidUtilities.runOnUIThread(new y81(this, 0));
        }
    }

    @Override
    public final boolean d1(String str, o9 o9Var) {
        this.f42218a = null;
        this.f42219b = null;
        AndroidUtilities.runOnUIThread(new tf0(this, str, o9Var, 29), 750L);
        return true;
    }

    @Override
    public final void V0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
