package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h implements Utilities.Callback {
    public final int f43176a;
    public final AtomicBoolean f43177b;
    public final nf.e f43178c;

    public h(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f43176a = i10;
        this.f43177b = atomicBoolean;
        this.f43178c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f43176a) {
            case 0:
                if (!this.f43177b.get()) {
                    this.f43178c.b();
                    return;
                }
                return;
            default:
                if (!this.f43177b.get() && (eVar = this.f43178c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
