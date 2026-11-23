package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg implements RequestDelegate {
    public final int f53802a;
    public final bn f53803b;
    public final TLRPC.TL_attachMenuBot f53804c;
    public final TLRPC.User d;

    public xg(bn bnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i7) {
        this.f53802a = i7;
        this.f53803b = bnVar;
        this.f53804c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53802a) {
            case 0:
                org.telegram.messenger.g0.g3(new ah(this.f53803b, this.f53804c, tL_error, this.d));
                return;
            default:
                org.telegram.messenger.g0.g3(new ah(this.f53803b, tL_error, this.f53804c, this.d));
                return;
        }
    }
}
