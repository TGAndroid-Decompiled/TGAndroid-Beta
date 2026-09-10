package sg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f41917a;
    public final AtomicBoolean f41918b;
    public final nf.e f41919c;

    public f(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f41917a = i10;
        this.f41918b = atomicBoolean;
        this.f41919c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f41917a) {
            case 0:
                if (!this.f41918b.get()) {
                    this.f41919c.b();
                    return;
                }
                return;
            default:
                if (!this.f41918b.get() && (eVar = this.f41919c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
