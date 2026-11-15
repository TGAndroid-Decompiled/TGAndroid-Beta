package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wg implements RequestDelegate {
    public final int f52905a;
    public final an f52906b;
    public final TLRPC.TL_attachMenuBot f52907c;
    public final TLRPC.User d;

    public wg(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i7) {
        this.f52905a = i7;
        this.f52906b = anVar;
        this.f52907c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52905a) {
            case 0:
                org.telegram.messenger.g0.h3(new ah(this.f52906b, this.f52907c, tL_error, this.d));
                return;
            default:
                org.telegram.messenger.g0.h3(new ah(this.f52906b, tL_error, this.f52907c, this.d));
                return;
        }
    }
}
