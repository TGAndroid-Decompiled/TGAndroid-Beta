package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h implements Utilities.Callback {
    public final int f43145a;
    public final AtomicBoolean f43146b;
    public final nf.e f43147c;

    public h(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f43145a = i10;
        this.f43146b = atomicBoolean;
        this.f43147c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f43145a) {
            case 0:
                if (!this.f43146b.get()) {
                    this.f43147c.b();
                    return;
                }
                return;
            default:
                if (!this.f43146b.get() && (eVar = this.f43147c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
