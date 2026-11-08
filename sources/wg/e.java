package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class e implements c20 {
    public final int f57717a;
    public final AtomicBoolean f57718b;
    public final vf.b f57719c;

    public e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.f57717a = i7;
        this.f57718b = atomicBoolean;
        this.f57719c = bVar;
    }

    @Override
    public final void a(Object obj) {
        vf.b bVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f57717a) {
            case 0:
                if (!this.f57718b.get()) {
                    this.f57719c.b();
                    return;
                }
                return;
            default:
                if (!this.f57718b.get() && (bVar = this.f57719c) != null) {
                    bVar.b();
                    return;
                }
                return;
        }
    }
}
