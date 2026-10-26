package vg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g implements Utilities.Callback {
    public final int f50177a;
    public final AtomicBoolean f50178b;
    public final qf.c f50179c;

    public g(AtomicBoolean atomicBoolean, qf.c cVar, int i10) {
        this.f50177a = i10;
        this.f50178b = atomicBoolean;
        this.f50179c = cVar;
    }

    @Override
    public final void run(Object obj) {
        qf.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f50177a) {
            case 0:
                if (!this.f50178b.get()) {
                    this.f50179c.b();
                    return;
                }
                return;
            default:
                if (!this.f50178b.get() && (cVar = this.f50179c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
