package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f43407a;
    public final AtomicBoolean f43408b;
    public final nf.e f43409c;

    public f(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f43407a = i10;
        this.f43408b = atomicBoolean;
        this.f43409c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f43407a) {
            case 0:
                if (!this.f43408b.get()) {
                    this.f43409c.b();
                    return;
                }
                return;
            default:
                if (!this.f43408b.get() && (eVar = this.f43409c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
