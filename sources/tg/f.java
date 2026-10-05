package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f47023a;
    public final AtomicBoolean f47024b;
    public final nf.e f47025c;

    public f(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f47023a = i10;
        this.f47024b = atomicBoolean;
        this.f47025c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f47023a) {
            case 0:
                if (!this.f47024b.get()) {
                    this.f47025c.b();
                    return;
                }
                return;
            default:
                if (!this.f47024b.get() && (eVar = this.f47025c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
