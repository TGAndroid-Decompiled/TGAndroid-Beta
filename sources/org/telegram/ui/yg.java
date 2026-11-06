package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yg implements RequestDelegate {
    public final int f52233a;
    public final an f52234b;
    public final TLRPC.TL_attachMenuBot f52235c;
    public final TLRPC.User d;

    public yg(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i7) {
        this.f52233a = i7;
        this.f52234b = anVar;
        this.f52235c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52233a) {
            case 0:
                org.telegram.messenger.g0.h3(new zg(this.f52234b, this.f52235c, tL_error, this.d));
                return;
            default:
                org.telegram.messenger.g0.h3(new zg(this.f52234b, tL_error, this.f52235c, this.d));
                return;
        }
    }
}
