package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uh implements RequestDelegate {
    public final int f40681a;
    public final fo f40682b;
    public final TLRPC.TL_attachMenuBot f40683c;
    public final TLRPC.User d;

    public uh(fo foVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f40681a = i10;
        this.f40682b = foVar;
        this.f40683c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40681a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xh(this.f40682b, this.f40683c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xh(this.f40682b, tL_error, this.f40683c, this.d));
                return;
        }
    }
}
