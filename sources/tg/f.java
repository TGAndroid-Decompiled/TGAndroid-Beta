package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f43421a;
    public final AtomicBoolean f43422b;
    public final nf.e f43423c;

    public f(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f43421a = i10;
        this.f43422b = atomicBoolean;
        this.f43423c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f43421a) {
            case 0:
                if (!this.f43422b.get()) {
                    this.f43423c.b();
                    return;
                }
                return;
            default:
                if (!this.f43422b.get() && (eVar = this.f43423c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
