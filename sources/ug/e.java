package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e implements Utilities.Callback {
    public final int f48116a;
    public final AtomicBoolean f48117b;
    public final pf.c f48118c;

    public e(AtomicBoolean atomicBoolean, pf.c cVar, int i10) {
        this.f48116a = i10;
        this.f48117b = atomicBoolean;
        this.f48118c = cVar;
    }

    @Override
    public final void run(Object obj) {
        pf.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f48116a) {
            case 0:
                if (!this.f48117b.get()) {
                    this.f48118c.b();
                    return;
                }
                return;
            default:
                if (!this.f48117b.get() && (cVar = this.f48118c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
