package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f48563a;
    public final AtomicBoolean f48564b;
    public final of.e f48565c;

    public f(AtomicBoolean atomicBoolean, of.e eVar, int i10) {
        this.f48563a = i10;
        this.f48564b = atomicBoolean;
        this.f48565c = eVar;
    }

    @Override
    public final void run(Object obj) {
        of.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f48563a) {
            case 0:
                if (!this.f48564b.get()) {
                    this.f48565c.b();
                    return;
                }
                return;
            default:
                if (!this.f48564b.get() && (eVar = this.f48565c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
