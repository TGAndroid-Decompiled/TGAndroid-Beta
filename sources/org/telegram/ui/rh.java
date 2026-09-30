package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rh implements RequestDelegate {
    public final int f37435a;
    public final wn f37436b;
    public final TLRPC.TL_attachMenuBot f37437c;
    public final TLRPC.User d;

    public rh(wn wnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f37435a = i10;
        this.f37436b = wnVar;
        this.f37437c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37435a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sh(this.f37436b, tL_error, this.f37437c, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sh(this.f37436b, this.f37437c, tL_error, this.d));
                return;
        }
    }
}
