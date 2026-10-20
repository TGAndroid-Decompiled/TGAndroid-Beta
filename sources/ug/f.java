package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f47680a;
    public final AtomicBoolean f47681b;
    public final pf.c f47682c;

    public f(AtomicBoolean atomicBoolean, pf.c cVar, int i10) {
        this.f47680a = i10;
        this.f47681b = atomicBoolean;
        this.f47682c = cVar;
    }

    @Override
    public final void run(Object obj) {
        pf.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f47680a) {
            case 0:
                if (!this.f47681b.get()) {
                    this.f47682c.b();
                    return;
                }
                return;
            default:
                if (!this.f47681b.get() && (cVar = this.f47682c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
