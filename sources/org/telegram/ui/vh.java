package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vh implements RequestDelegate {
    public final int f38549a;
    public final zn f38550b;
    public final TLRPC.TL_attachMenuBot f38551c;
    public final TLRPC.User d;

    public vh(zn znVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f38549a = i10;
        this.f38550b = znVar;
        this.f38551c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38549a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wh(this.f38550b, tL_error, this.f38551c, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wh(this.f38550b, this.f38551c, tL_error, this.d));
                return;
        }
    }
}
