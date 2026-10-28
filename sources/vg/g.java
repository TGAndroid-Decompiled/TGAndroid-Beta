package vg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g implements Utilities.Callback {
    public final int f50212a;
    public final AtomicBoolean f50213b;
    public final qf.c f50214c;

    public g(AtomicBoolean atomicBoolean, qf.c cVar, int i10) {
        this.f50212a = i10;
        this.f50213b = atomicBoolean;
        this.f50214c = cVar;
    }

    @Override
    public final void run(Object obj) {
        qf.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f50212a) {
            case 0:
                if (!this.f50213b.get()) {
                    this.f50214c.b();
                    return;
                }
                return;
            default:
                if (!this.f50213b.get() && (cVar = this.f50214c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
