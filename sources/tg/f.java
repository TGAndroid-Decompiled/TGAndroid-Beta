package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f48324a;
    public final AtomicBoolean f48325b;
    public final of.e f48326c;

    public f(AtomicBoolean atomicBoolean, of.e eVar, int i10) {
        this.f48324a = i10;
        this.f48325b = atomicBoolean;
        this.f48326c = eVar;
    }

    @Override
    public final void run(Object obj) {
        of.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f48324a) {
            case 0:
                if (!this.f48325b.get()) {
                    this.f48326c.b();
                    return;
                }
                return;
            default:
                if (!this.f48325b.get() && (eVar = this.f48326c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
