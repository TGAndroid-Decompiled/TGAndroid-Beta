package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f47673a;
    public final AtomicBoolean f47674b;
    public final pf.c f47675c;

    public f(AtomicBoolean atomicBoolean, pf.c cVar, int i10) {
        this.f47673a = i10;
        this.f47674b = atomicBoolean;
        this.f47675c = cVar;
    }

    @Override
    public final void run(Object obj) {
        pf.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f47673a) {
            case 0:
                if (!this.f47674b.get()) {
                    this.f47675c.b();
                    return;
                }
                return;
            default:
                if (!this.f47674b.get() && (cVar = this.f47675c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
