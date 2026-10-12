package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f48534a;
    public final AtomicBoolean f48535b;
    public final of.e f48536c;

    public f(AtomicBoolean atomicBoolean, of.e eVar, int i10) {
        this.f48534a = i10;
        this.f48535b = atomicBoolean;
        this.f48536c = eVar;
    }

    @Override
    public final void run(Object obj) {
        of.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f48534a) {
            case 0:
                if (!this.f48535b.get()) {
                    this.f48536c.b();
                    return;
                }
                return;
            default:
                if (!this.f48535b.get() && (eVar = this.f48536c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
