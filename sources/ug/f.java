package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f47675a;
    public final AtomicBoolean f47676b;
    public final pf.c f47677c;

    public f(AtomicBoolean atomicBoolean, pf.c cVar, int i10) {
        this.f47675a = i10;
        this.f47676b = atomicBoolean;
        this.f47677c = cVar;
    }

    @Override
    public final void run(Object obj) {
        pf.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f47675a) {
            case 0:
                if (!this.f47676b.get()) {
                    this.f47677c.b();
                    return;
                }
                return;
            default:
                if (!this.f47676b.get() && (cVar = this.f47677c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
