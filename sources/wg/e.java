package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class e implements x10 {
    public final int f59758a;
    public final AtomicBoolean f59759b;
    public final vf.b f59760c;

    public e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.f59758a = i7;
        this.f59759b = atomicBoolean;
        this.f59760c = bVar;
    }

    @Override
    public final void a(Object obj) {
        vf.b bVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f59758a) {
            case 0:
                if (!this.f59759b.get()) {
                    this.f59760c.b();
                    return;
                }
                return;
            default:
                if (!this.f59759b.get() && (bVar = this.f59760c) != null) {
                    bVar.b();
                    return;
                }
                return;
        }
    }
}
