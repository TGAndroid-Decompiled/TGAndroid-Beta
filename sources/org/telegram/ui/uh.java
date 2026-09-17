package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uh implements RequestDelegate {
    public final int f38072a;
    public final bo f38073b;
    public final TLRPC.TL_attachMenuBot f38074c;
    public final TLRPC.User d;

    public uh(bo boVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f38072a = i10;
        this.f38073b = boVar;
        this.f38074c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38072a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yh(this.f38073b, this.f38074c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yh(this.f38073b, tL_error, this.f38074c, this.d));
                return;
        }
    }
}
