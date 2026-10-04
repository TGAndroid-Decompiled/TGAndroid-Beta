package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rh implements RequestDelegate {
    public final int f40123a;
    public final yn f40124b;
    public final TLRPC.TL_attachMenuBot f40125c;
    public final TLRPC.User d;

    public rh(yn ynVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f40123a = i10;
        this.f40124b = ynVar;
        this.f40125c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40123a) {
            case 0:
                AndroidUtilities.runOnUIThread(new uh(this.f40124b, this.f40125c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new uh(this.f40124b, tL_error, this.f40125c, this.d));
                return;
        }
    }
}
