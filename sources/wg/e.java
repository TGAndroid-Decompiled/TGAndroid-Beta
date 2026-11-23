package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class e implements y10 {
    public final int f59783a;
    public final AtomicBoolean f59784b;
    public final vf.b f59785c;

    public e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.f59783a = i7;
        this.f59784b = atomicBoolean;
        this.f59785c = bVar;
    }

    @Override
    public final void a(Object obj) {
        vf.b bVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f59783a) {
            case 0:
                if (!this.f59784b.get()) {
                    this.f59785c.b();
                    return;
                }
                return;
            default:
                if (!this.f59784b.get() && (bVar = this.f59785c) != null) {
                    bVar.b();
                    return;
                }
                return;
        }
    }
}
