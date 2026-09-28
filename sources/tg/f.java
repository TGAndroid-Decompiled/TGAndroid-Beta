package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f43408a;
    public final AtomicBoolean f43409b;
    public final nf.e f43410c;

    public f(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f43408a = i10;
        this.f43409b = atomicBoolean;
        this.f43410c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f43408a) {
            case 0:
                if (!this.f43409b.get()) {
                    this.f43410c.b();
                    return;
                }
                return;
            default:
                if (!this.f43409b.get() && (eVar = this.f43410c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
