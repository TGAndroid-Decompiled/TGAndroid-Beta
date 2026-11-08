package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class e implements c20 {
    public final int f57718a;
    public final AtomicBoolean f57719b;
    public final vf.b f57720c;

    public e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.f57718a = i7;
        this.f57719b = atomicBoolean;
        this.f57720c = bVar;
    }

    @Override
    public final void a(Object obj) {
        vf.b bVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f57718a) {
            case 0:
                if (!this.f57719b.get()) {
                    this.f57720c.b();
                    return;
                }
                return;
            default:
                if (!this.f57719b.get() && (bVar = this.f57720c) != null) {
                    bVar.b();
                    return;
                }
                return;
        }
    }
}
