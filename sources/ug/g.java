package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g implements Utilities.Callback {
    public final int f46315a;
    public final AtomicBoolean f46316b;
    public final pf.c f46317c;

    public g(AtomicBoolean atomicBoolean, pf.c cVar, int i10) {
        this.f46315a = i10;
        this.f46316b = atomicBoolean;
        this.f46317c = cVar;
    }

    @Override
    public final void run(Object obj) {
        pf.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f46315a) {
            case 0:
                if (!this.f46316b.get()) {
                    this.f46317c.b();
                    return;
                }
                return;
            default:
                if (!this.f46316b.get() && (cVar = this.f46317c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
