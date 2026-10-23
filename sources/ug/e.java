package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e implements Utilities.Callback {
    public final int f48117a;
    public final AtomicBoolean f48118b;
    public final pf.c f48119c;

    public e(AtomicBoolean atomicBoolean, pf.c cVar, int i10) {
        this.f48117a = i10;
        this.f48118b = atomicBoolean;
        this.f48119c = cVar;
    }

    @Override
    public final void run(Object obj) {
        pf.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f48117a) {
            case 0:
                if (!this.f48118b.get()) {
                    this.f48119c.b();
                    return;
                }
                return;
            default:
                if (!this.f48118b.get() && (cVar = this.f48119c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
