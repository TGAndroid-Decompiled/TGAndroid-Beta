package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f47008a;
    public final AtomicBoolean f47009b;
    public final nf.e f47010c;

    public f(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f47008a = i10;
        this.f47009b = atomicBoolean;
        this.f47010c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f47008a) {
            case 0:
                if (!this.f47009b.get()) {
                    this.f47010c.b();
                    return;
                }
                return;
            default:
                if (!this.f47009b.get() && (eVar = this.f47010c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
