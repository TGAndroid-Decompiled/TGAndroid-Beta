package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yg implements RequestDelegate {
    public final int f52213a;
    public final an f52214b;
    public final TLRPC.TL_attachMenuBot f52215c;
    public final TLRPC.User d;

    public yg(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i7) {
        this.f52213a = i7;
        this.f52214b = anVar;
        this.f52215c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52213a) {
            case 0:
                org.telegram.messenger.g0.h3(new zg(this.f52214b, this.f52215c, tL_error, this.d));
                return;
            default:
                org.telegram.messenger.g0.h3(new zg(this.f52214b, tL_error, this.f52215c, this.d));
                return;
        }
    }
}
