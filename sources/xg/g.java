package xg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
public final class g implements u10 {
    public final int f58706a;
    public final AtomicBoolean f58707b;
    public final sf.b f58708c;

    public g(AtomicBoolean atomicBoolean, sf.b bVar, int i3) {
        this.f58706a = i3;
        this.f58707b = atomicBoolean;
        this.f58708c = bVar;
    }

    @Override
    public final void a(Object obj) {
        sf.b bVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f58706a) {
            case 0:
                if (!this.f58707b.get()) {
                    this.f58708c.b();
                    return;
                }
                return;
            default:
                if (!this.f58707b.get() && (bVar = this.f58708c) != null) {
                    bVar.b();
                    return;
                }
                return;
        }
    }
}
