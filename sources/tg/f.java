package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f43393a;
    public final AtomicBoolean f43394b;
    public final nf.e f43395c;

    public f(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f43393a = i10;
        this.f43394b = atomicBoolean;
        this.f43395c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f43393a) {
            case 0:
                if (!this.f43394b.get()) {
                    this.f43395c.b();
                    return;
                }
                return;
            default:
                if (!this.f43394b.get() && (eVar = this.f43395c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
