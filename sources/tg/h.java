package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h implements Utilities.Callback {
    public final int f43149a;
    public final AtomicBoolean f43150b;
    public final nf.e f43151c;

    public h(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f43149a = i10;
        this.f43150b = atomicBoolean;
        this.f43151c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f43149a) {
            case 0:
                if (!this.f43150b.get()) {
                    this.f43151c.b();
                    return;
                }
                return;
            default:
                if (!this.f43150b.get() && (eVar = this.f43151c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
