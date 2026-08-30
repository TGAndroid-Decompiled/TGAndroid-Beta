package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z71 implements u9 {
    public TLObject f40700a = null;
    public TLRPC.TL_error f40701b = null;
    public final SessionsActivity f40702c;

    public z71(SessionsActivity sessionsActivity) {
        this.f40702c = sessionsActivity;
    }

    @Override
    public final String G0() {
        return null;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f40700a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z4 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f40702c;
            if (z4) {
                sessionsActivity.f32284f.add(0, tL_authorization);
                sessionsActivity.S = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f32281a.l();
            sessionsActivity.f32287s.m(0L, this.f40700a, 11);
        } else if (this.f40701b != null) {
            AndroidUtilities.runOnUIThread(new y71(this, 0));
        }
    }

    @Override
    public final boolean f1(String str, m9 m9Var) {
        this.f40700a = null;
        this.f40701b = null;
        AndroidUtilities.runOnUIThread(new hf0(this, str, m9Var, 29), 750L);
        return true;
    }

    @Override
    public final void S0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
