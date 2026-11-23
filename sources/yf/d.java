package yf;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import wg.p;
public final class d implements RequestDelegate {
    public final int f61324a;
    public final Object f61325b;

    public d(Object obj, int i7) {
        this.f61324a = i7;
        this.f61325b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f61324a) {
            case 0:
                g0.g3(new p((e) this.f61325b, tLObject, tL_error));
                return;
            default:
                g0.g3(new v9.b(19, (c) this.f61325b, tLObject));
                return;
        }
    }
}
