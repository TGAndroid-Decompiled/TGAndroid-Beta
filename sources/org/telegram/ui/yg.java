package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yg implements RequestDelegate {
    public final int f52214a;
    public final an f52215b;
    public final TLRPC.TL_attachMenuBot f52216c;
    public final TLRPC.User d;

    public yg(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i7) {
        this.f52214a = i7;
        this.f52215b = anVar;
        this.f52216c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52214a) {
            case 0:
                org.telegram.messenger.g0.h3(new zg(this.f52215b, this.f52216c, tL_error, this.d));
                return;
            default:
                org.telegram.messenger.g0.h3(new zg(this.f52215b, tL_error, this.f52216c, this.d));
                return;
        }
    }
}
