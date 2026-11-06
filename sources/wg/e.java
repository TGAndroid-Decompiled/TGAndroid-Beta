package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class e implements c20 {
    public final int f57625a;
    public final AtomicBoolean f57626b;
    public final vf.b f57627c;

    public e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.f57625a = i7;
        this.f57626b = atomicBoolean;
        this.f57627c = bVar;
    }

    @Override
    public final void a(Object obj) {
        vf.b bVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f57625a) {
            case 0:
                if (!this.f57626b.get()) {
                    this.f57627c.b();
                    return;
                }
                return;
            default:
                if (!this.f57626b.get() && (bVar = this.f57627c) != null) {
                    bVar.b();
                    return;
                }
                return;
        }
    }
}
