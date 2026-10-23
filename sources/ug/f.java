package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f47684a;
    public final AtomicBoolean f47685b;
    public final pf.c f47686c;

    public f(AtomicBoolean atomicBoolean, pf.c cVar, int i10) {
        this.f47684a = i10;
        this.f47685b = atomicBoolean;
        this.f47686c = cVar;
    }

    @Override
    public final void run(Object obj) {
        pf.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f47684a) {
            case 0:
                if (!this.f47685b.get()) {
                    this.f47686c.b();
                    return;
                }
                return;
            default:
                if (!this.f47685b.get() && (cVar = this.f47686c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
