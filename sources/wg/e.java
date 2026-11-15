package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class e implements z10 {
    public final int f59177a;
    public final AtomicBoolean f59178b;
    public final vf.b f59179c;

    public e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.f59177a = i7;
        this.f59178b = atomicBoolean;
        this.f59179c = bVar;
    }

    @Override
    public final void a(Object obj) {
        vf.b bVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f59177a) {
            case 0:
                if (!this.f59178b.get()) {
                    this.f59179c.b();
                    return;
                }
                return;
            default:
                if (!this.f59178b.get() && (bVar = this.f59179c) != null) {
                    bVar.b();
                    return;
                }
                return;
        }
    }
}
