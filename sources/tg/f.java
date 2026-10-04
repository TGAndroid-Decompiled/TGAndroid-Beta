package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f47009a;
    public final AtomicBoolean f47010b;
    public final nf.e f47011c;

    public f(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f47009a = i10;
        this.f47010b = atomicBoolean;
        this.f47011c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f47009a) {
            case 0:
                if (!this.f47010b.get()) {
                    this.f47011c.b();
                    return;
                }
                return;
            default:
                if (!this.f47010b.get() && (eVar = this.f47011c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
