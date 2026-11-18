package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg implements RequestDelegate {
    public final int f53841a;
    public final bn f53842b;
    public final TLRPC.TL_attachMenuBot f53843c;
    public final TLRPC.User d;

    public xg(bn bnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i7) {
        this.f53841a = i7;
        this.f53842b = bnVar;
        this.f53843c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53841a) {
            case 0:
                org.telegram.messenger.g0.g3(new ah(this.f53842b, this.f53843c, tL_error, this.d));
                return;
            default:
                org.telegram.messenger.g0.g3(new ah(this.f53842b, tL_error, this.f53843c, this.d));
                return;
        }
    }
}
