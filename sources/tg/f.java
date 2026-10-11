package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f48427a;
    public final AtomicBoolean f48428b;
    public final of.e f48429c;

    public f(AtomicBoolean atomicBoolean, of.e eVar, int i10) {
        this.f48427a = i10;
        this.f48428b = atomicBoolean;
        this.f48429c = eVar;
    }

    @Override
    public final void run(Object obj) {
        of.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f48427a) {
            case 0:
                if (!this.f48428b.get()) {
                    this.f48429c.b();
                    return;
                }
                return;
            default:
                if (!this.f48428b.get() && (eVar = this.f48429c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
