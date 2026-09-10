package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vh implements RequestDelegate {
    public final int f37557a;
    public final eo f37558b;
    public final TLRPC.TL_attachMenuBot f37559c;
    public final TLRPC.User d;

    public vh(eo eoVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f37557a = i10;
        this.f37558b = eoVar;
        this.f37559c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37557a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yh(this.f37558b, this.f37559c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yh(this.f37558b, tL_error, this.f37559c, this.d));
                return;
        }
    }
}
