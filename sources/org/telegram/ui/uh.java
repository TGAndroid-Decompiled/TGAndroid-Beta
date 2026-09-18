package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uh implements RequestDelegate {
    public final int f38077a;
    public final bo f38078b;
    public final TLRPC.TL_attachMenuBot f38079c;
    public final TLRPC.User d;

    public uh(bo boVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f38077a = i10;
        this.f38078b = boVar;
        this.f38079c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38077a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yh(this.f38078b, this.f38079c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yh(this.f38078b, tL_error, this.f38079c, this.d));
                return;
        }
    }
}
