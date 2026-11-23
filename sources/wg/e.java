package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class e implements y10 {
    public final int f59748a;
    public final AtomicBoolean f59749b;
    public final vf.b f59750c;

    public e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.f59748a = i7;
        this.f59749b = atomicBoolean;
        this.f59750c = bVar;
    }

    @Override
    public final void a(Object obj) {
        vf.b bVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f59748a) {
            case 0:
                if (!this.f59749b.get()) {
                    this.f59750c.b();
                    return;
                }
                return;
            default:
                if (!this.f59749b.get() && (bVar = this.f59750c) != null) {
                    bVar.b();
                    return;
                }
                return;
        }
    }
}
