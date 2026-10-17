package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e implements Utilities.Callback {
    public final int f47692a;
    public final AtomicBoolean f47693b;
    public final pf.c f47694c;

    public e(AtomicBoolean atomicBoolean, pf.c cVar, int i10) {
        this.f47692a = i10;
        this.f47693b = atomicBoolean;
        this.f47694c = cVar;
    }

    @Override
    public final void run(Object obj) {
        pf.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f47692a) {
            case 0:
                if (!this.f47693b.get()) {
                    this.f47694c.b();
                    return;
                }
                return;
            default:
                if (!this.f47693b.get() && (cVar = this.f47694c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
