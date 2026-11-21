package yf;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import wg.p;
import wg.q;
public final class d implements RequestDelegate {
    public final int f61236a;
    public final Object f61237b;

    public d(Object obj, int i7) {
        this.f61236a = i7;
        this.f61237b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f61236a) {
            case 0:
                g0.g3(new p((e) this.f61237b, tLObject, tL_error));
                return;
            default:
                g0.g3(new q(15, (c) this.f61237b, tLObject));
                return;
        }
    }
}
