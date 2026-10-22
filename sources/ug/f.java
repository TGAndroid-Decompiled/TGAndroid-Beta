package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f47683a;
    public final AtomicBoolean f47684b;
    public final pf.c f47685c;

    public f(AtomicBoolean atomicBoolean, pf.c cVar, int i10) {
        this.f47683a = i10;
        this.f47684b = atomicBoolean;
        this.f47685c = cVar;
    }

    @Override
    public final void run(Object obj) {
        pf.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f47683a) {
            case 0:
                if (!this.f47684b.get()) {
                    this.f47685c.b();
                    return;
                }
                return;
            default:
                if (!this.f47684b.get() && (cVar = this.f47685c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
