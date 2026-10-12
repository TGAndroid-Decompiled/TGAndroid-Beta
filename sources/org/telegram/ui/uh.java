package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uh implements RequestDelegate {
    public final int f42519a;
    public final eo f42520b;
    public final TLRPC.TL_attachMenuBot f42521c;
    public final TLRPC.User d;

    public uh(eo eoVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f42519a = i10;
        this.f42520b = eoVar;
        this.f42521c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42519a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xh(this.f42520b, this.f42521c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xh(this.f42520b, tL_error, this.f42521c, this.d));
                return;
        }
    }
}
