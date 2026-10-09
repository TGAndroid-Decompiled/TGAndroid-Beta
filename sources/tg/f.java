package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f48322a;
    public final AtomicBoolean f48323b;
    public final of.e f48324c;

    public f(AtomicBoolean atomicBoolean, of.e eVar, int i10) {
        this.f48322a = i10;
        this.f48323b = atomicBoolean;
        this.f48324c = eVar;
    }

    @Override
    public final void run(Object obj) {
        of.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f48322a) {
            case 0:
                if (!this.f48323b.get()) {
                    this.f48324c.b();
                    return;
                }
                return;
            default:
                if (!this.f48323b.get() && (eVar = this.f48324c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
