package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uh implements RequestDelegate {
    public final int f42521a;
    public final eo f42522b;
    public final TLRPC.TL_attachMenuBot f42523c;
    public final TLRPC.User d;

    public uh(eo eoVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f42521a = i10;
        this.f42522b = eoVar;
        this.f42523c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42521a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xh(this.f42522b, this.f42523c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xh(this.f42522b, tL_error, this.f42523c, this.d));
                return;
        }
    }
}
