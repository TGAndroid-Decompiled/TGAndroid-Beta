package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uh implements RequestDelegate {
    public final int f38255a;
    public final xn f38256b;
    public final TLRPC.TL_attachMenuBot f38257c;
    public final TLRPC.User d;

    public uh(xn xnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f38255a = i10;
        this.f38256b = xnVar;
        this.f38257c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38255a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vh(this.f38256b, tL_error, this.f38257c, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new vh(this.f38256b, this.f38257c, tL_error, this.d));
                return;
        }
    }
}
