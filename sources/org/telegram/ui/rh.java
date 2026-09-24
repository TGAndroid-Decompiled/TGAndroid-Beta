package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rh implements RequestDelegate {
    public final int f37321a;
    public final wn f37322b;
    public final TLRPC.TL_attachMenuBot f37323c;
    public final TLRPC.User d;

    public rh(wn wnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f37321a = i10;
        this.f37322b = wnVar;
        this.f37323c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37321a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sh(this.f37322b, tL_error, this.f37323c, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sh(this.f37322b, this.f37323c, tL_error, this.d));
                return;
        }
    }
}
