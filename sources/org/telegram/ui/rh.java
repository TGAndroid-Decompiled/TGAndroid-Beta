package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rh implements RequestDelegate {
    public final int f40100a;
    public final yn f40101b;
    public final TLRPC.TL_attachMenuBot f40102c;
    public final TLRPC.User d;

    public rh(yn ynVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f40100a = i10;
        this.f40101b = ynVar;
        this.f40102c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40100a) {
            case 0:
                AndroidUtilities.runOnUIThread(new uh(this.f40101b, this.f40102c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new uh(this.f40101b, tL_error, this.f40102c, this.d));
                return;
        }
    }
}
