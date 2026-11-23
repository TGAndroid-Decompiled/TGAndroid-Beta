package yf;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import wg.p;
import wg.q;
public final class d implements RequestDelegate {
    public final int f61240a;
    public final Object f61241b;

    public d(Object obj, int i7) {
        this.f61240a = i7;
        this.f61241b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f61240a) {
            case 0:
                g0.g3(new p((e) this.f61241b, tLObject, tL_error));
                return;
            default:
                g0.g3(new q(15, (c) this.f61241b, tLObject));
                return;
        }
    }
}
