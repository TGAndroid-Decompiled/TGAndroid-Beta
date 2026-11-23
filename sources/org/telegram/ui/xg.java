package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg implements RequestDelegate {
    public final int f53964a;
    public final bn f53965b;
    public final TLRPC.TL_attachMenuBot f53966c;
    public final TLRPC.User d;

    public xg(bn bnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i7) {
        this.f53964a = i7;
        this.f53965b = bnVar;
        this.f53966c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53964a) {
            case 0:
                org.telegram.messenger.g0.g3(new bh(this.f53965b, this.f53966c, tL_error, this.d));
                return;
            default:
                org.telegram.messenger.g0.g3(new bh(this.f53965b, tL_error, this.f53966c, this.d));
                return;
        }
    }
}
