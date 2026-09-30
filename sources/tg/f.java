package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f43409a;
    public final AtomicBoolean f43410b;
    public final nf.e f43411c;

    public f(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f43409a = i10;
        this.f43410b = atomicBoolean;
        this.f43411c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f43409a) {
            case 0:
                if (!this.f43410b.get()) {
                    this.f43411c.b();
                    return;
                }
                return;
            default:
                if (!this.f43410b.get() && (eVar = this.f43411c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
