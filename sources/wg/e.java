package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class e implements w10 {
    public final int f59868a;
    public final AtomicBoolean f59869b;
    public final vf.b f59870c;

    public e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.f59868a = i7;
        this.f59869b = atomicBoolean;
        this.f59870c = bVar;
    }

    @Override
    public final void a(Object obj) {
        vf.b bVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f59868a) {
            case 0:
                if (!this.f59869b.get()) {
                    this.f59870c.b();
                    return;
                }
                return;
            default:
                if (!this.f59869b.get() && (bVar = this.f59870c) != null) {
                    bVar.b();
                    return;
                }
                return;
        }
    }
}
