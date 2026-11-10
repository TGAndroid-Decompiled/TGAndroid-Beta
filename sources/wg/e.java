package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class e implements c20 {
    public final int f57715a;
    public final AtomicBoolean f57716b;
    public final vf.b f57717c;

    public e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.f57715a = i7;
        this.f57716b = atomicBoolean;
        this.f57717c = bVar;
    }

    @Override
    public final void a(Object obj) {
        vf.b bVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f57715a) {
            case 0:
                if (!this.f57716b.get()) {
                    this.f57717c.b();
                    return;
                }
                return;
            default:
                if (!this.f57716b.get() && (bVar = this.f57717c) != null) {
                    bVar.b();
                    return;
                }
                return;
        }
    }
}
