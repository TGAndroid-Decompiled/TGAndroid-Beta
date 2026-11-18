package yf;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import wg.q;
import wg.r;
public final class d implements RequestDelegate {
    public final int f61195a;
    public final Object f61196b;

    public d(Object obj, int i7) {
        this.f61195a = i7;
        this.f61196b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f61195a) {
            case 0:
                g0.g3(new q((e) this.f61196b, tLObject, tL_error, 3));
                return;
            default:
                g0.g3(new r(13, (c) this.f61196b, tLObject));
                return;
        }
    }
}
