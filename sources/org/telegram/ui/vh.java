package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vh implements RequestDelegate {
    public final int f38553a;
    public final zn f38554b;
    public final TLRPC.TL_attachMenuBot f38555c;
    public final TLRPC.User d;

    public vh(zn znVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f38553a = i10;
        this.f38554b = znVar;
        this.f38555c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38553a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wh(this.f38554b, tL_error, this.f38555c, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wh(this.f38554b, this.f38555c, tL_error, this.d));
                return;
        }
    }
}
