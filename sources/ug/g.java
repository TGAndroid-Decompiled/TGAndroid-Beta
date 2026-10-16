package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g implements Utilities.Callback {
    public final int f46314a;
    public final AtomicBoolean f46315b;
    public final pf.c f46316c;

    public g(AtomicBoolean atomicBoolean, pf.c cVar, int i10) {
        this.f46314a = i10;
        this.f46315b = atomicBoolean;
        this.f46316c = cVar;
    }

    @Override
    public final void run(Object obj) {
        pf.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f46314a) {
            case 0:
                if (!this.f46315b.get()) {
                    this.f46316c.b();
                    return;
                }
                return;
            default:
                if (!this.f46315b.get() && (cVar = this.f46316c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
