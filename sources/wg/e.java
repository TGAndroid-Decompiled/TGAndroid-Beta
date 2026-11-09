package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class e implements c20 {
    public final int f57716a;
    public final AtomicBoolean f57717b;
    public final vf.b f57718c;

    public e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.f57716a = i7;
        this.f57717b = atomicBoolean;
        this.f57718c = bVar;
    }

    @Override
    public final void a(Object obj) {
        vf.b bVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f57716a) {
            case 0:
                if (!this.f57717b.get()) {
                    this.f57718c.b();
                    return;
                }
                return;
            default:
                if (!this.f57717b.get() && (bVar = this.f57718c) != null) {
                    bVar.b();
                    return;
                }
                return;
        }
    }
}
