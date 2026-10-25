package vg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g implements Utilities.Callback {
    public final int f50174a;
    public final AtomicBoolean f50175b;
    public final qf.c f50176c;

    public g(AtomicBoolean atomicBoolean, qf.c cVar, int i10) {
        this.f50174a = i10;
        this.f50175b = atomicBoolean;
        this.f50176c = cVar;
    }

    @Override
    public final void run(Object obj) {
        qf.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f50174a) {
            case 0:
                if (!this.f50175b.get()) {
                    this.f50176c.b();
                    return;
                }
                return;
            default:
                if (!this.f50175b.get() && (cVar = this.f50176c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
