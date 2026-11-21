package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class e implements x10 {
    public final int f59779a;
    public final AtomicBoolean f59780b;
    public final vf.b f59781c;

    public e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.f59779a = i7;
        this.f59780b = atomicBoolean;
        this.f59781c = bVar;
    }

    @Override
    public final void a(Object obj) {
        vf.b bVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f59779a) {
            case 0:
                if (!this.f59780b.get()) {
                    this.f59781c.b();
                    return;
                }
                return;
            default:
                if (!this.f59780b.get() && (bVar = this.f59781c) != null) {
                    bVar.b();
                    return;
                }
                return;
        }
    }
}
