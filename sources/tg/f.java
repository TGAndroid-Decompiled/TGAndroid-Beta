package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f43515a;
    public final AtomicBoolean f43516b;
    public final nf.e f43517c;

    public f(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f43515a = i10;
        this.f43516b = atomicBoolean;
        this.f43517c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f43515a) {
            case 0:
                if (!this.f43516b.get()) {
                    this.f43517c.b();
                    return;
                }
                return;
            default:
                if (!this.f43516b.get() && (eVar = this.f43517c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
