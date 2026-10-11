package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s81 implements t9 {
    public TLObject f41675a = null;
    public TLRPC.TL_error f41676b = null;
    public final SessionsActivity f41677c;

    public s81(SessionsActivity sessionsActivity) {
        this.f41677c = sessionsActivity;
    }

    @Override
    public final void K(String str) {
        TLObject tLObject = this.f41675a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z10 = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.f41677c;
            if (z10) {
                sessionsActivity.f34539f.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.k0(false);
            } else {
                sessionsActivity.f34538e.add(0, tL_authorization);
            }
            sessionsActivity.m0();
            sessionsActivity.f34535a.l();
            sessionsActivity.f34542s.m(0L, this.f41675a, 11);
        } else if (this.f41676b != null) {
            AndroidUtilities.runOnUIThread(new r81(this, 0));
        }
    }

    @Override
    public final boolean Z0(String str, j9 j9Var) {
        this.f41675a = null;
        this.f41676b = null;
        AndroidUtilities.runOnUIThread(new nf0(this, str, j9Var, 29), 750L);
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
