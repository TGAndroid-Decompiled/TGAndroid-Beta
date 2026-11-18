package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class e implements x10 {
    public final int f59757a;
    public final AtomicBoolean f59758b;
    public final vf.b f59759c;

    public e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.f59757a = i7;
        this.f59758b = atomicBoolean;
        this.f59759c = bVar;
    }

    @Override
    public final void a(Object obj) {
        vf.b bVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f59757a) {
            case 0:
                if (!this.f59758b.get()) {
                    this.f59759c.b();
                    return;
                }
                return;
            default:
                if (!this.f59758b.get() && (bVar = this.f59759c) != null) {
                    bVar.b();
                    return;
                }
                return;
        }
    }
}
