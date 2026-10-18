package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f47720a;
    public final AtomicBoolean f47721b;
    public final pf.c f47722c;

    public f(AtomicBoolean atomicBoolean, pf.c cVar, int i10) {
        this.f47720a = i10;
        this.f47721b = atomicBoolean;
        this.f47722c = cVar;
    }

    @Override
    public final void run(Object obj) {
        pf.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f47720a) {
            case 0:
                if (!this.f47721b.get()) {
                    this.f47722c.b();
                    return;
                }
                return;
            default:
                if (!this.f47721b.get() && (cVar = this.f47722c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
