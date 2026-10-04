package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f47016a;
    public final AtomicBoolean f47017b;
    public final nf.e f47018c;

    public f(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f47016a = i10;
        this.f47017b = atomicBoolean;
        this.f47018c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f47016a) {
            case 0:
                if (!this.f47017b.get()) {
                    this.f47018c.b();
                    return;
                }
                return;
            default:
                if (!this.f47017b.get() && (eVar = this.f47018c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
