package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h implements Utilities.Callback {
    public final int f43171a;
    public final AtomicBoolean f43172b;
    public final nf.e f43173c;

    public h(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f43171a = i10;
        this.f43172b = atomicBoolean;
        this.f43173c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f43171a) {
            case 0:
                if (!this.f43172b.get()) {
                    this.f43173c.b();
                    return;
                }
                return;
            default:
                if (!this.f43172b.get() && (eVar = this.f43173c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
