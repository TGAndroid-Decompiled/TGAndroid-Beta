package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wg implements RequestDelegate {
    public final int f52908a;
    public final an f52909b;
    public final TLRPC.TL_attachMenuBot f52910c;
    public final TLRPC.User d;

    public wg(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i7) {
        this.f52908a = i7;
        this.f52909b = anVar;
        this.f52910c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52908a) {
            case 0:
                org.telegram.messenger.g0.h3(new ah(this.f52909b, this.f52910c, tL_error, this.d));
                return;
            default:
                org.telegram.messenger.g0.h3(new ah(this.f52909b, tL_error, this.f52910c, this.d));
                return;
        }
    }
}
