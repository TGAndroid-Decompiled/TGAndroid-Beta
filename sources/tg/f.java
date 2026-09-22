package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f43442a;
    public final AtomicBoolean f43443b;
    public final nf.e f43444c;

    public f(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f43442a = i10;
        this.f43443b = atomicBoolean;
        this.f43444c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f43442a) {
            case 0:
                if (!this.f43443b.get()) {
                    this.f43444c.b();
                    return;
                }
                return;
            default:
                if (!this.f43443b.get() && (eVar = this.f43444c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
