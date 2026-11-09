package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zg implements RequestDelegate {
    public final int f52553a;
    public final cn f52554b;
    public final TLRPC.TL_attachMenuBot f52555c;
    public final TLRPC.User d;

    public zg(cn cnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i7) {
        this.f52553a = i7;
        this.f52554b = cnVar;
        this.f52555c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52553a) {
            case 0:
                org.telegram.messenger.g0.h3(new ch(this.f52554b, this.f52555c, tL_error, this.d));
                return;
            default:
                org.telegram.messenger.g0.h3(new ch(this.f52554b, tL_error, this.f52555c, this.d));
                return;
        }
    }
}
