package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rh implements RequestDelegate {
    public final int f40122a;
    public final yn f40123b;
    public final TLRPC.TL_attachMenuBot f40124c;
    public final TLRPC.User d;

    public rh(yn ynVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f40122a = i10;
        this.f40123b = ynVar;
        this.f40124c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40122a) {
            case 0:
                AndroidUtilities.runOnUIThread(new uh(this.f40123b, this.f40124c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new uh(this.f40123b, tL_error, this.f40124c, this.d));
                return;
        }
    }
}
