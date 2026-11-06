package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class e implements c20 {
    public final int f57626a;
    public final AtomicBoolean f57627b;
    public final vf.b f57628c;

    public e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.f57626a = i7;
        this.f57627b = atomicBoolean;
        this.f57628c = bVar;
    }

    @Override
    public final void a(Object obj) {
        vf.b bVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f57626a) {
            case 0:
                if (!this.f57627b.get()) {
                    this.f57628c.b();
                    return;
                }
                return;
            default:
                if (!this.f57627b.get() && (bVar = this.f57628c) != null) {
                    bVar.b();
                    return;
                }
                return;
        }
    }
}
