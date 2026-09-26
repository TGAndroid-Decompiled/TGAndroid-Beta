package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f43406a;
    public final AtomicBoolean f43407b;
    public final nf.e f43408c;

    public f(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f43406a = i10;
        this.f43407b = atomicBoolean;
        this.f43408c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f43406a) {
            case 0:
                if (!this.f43407b.get()) {
                    this.f43408c.b();
                    return;
                }
                return;
            default:
                if (!this.f43407b.get() && (eVar = this.f43408c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
