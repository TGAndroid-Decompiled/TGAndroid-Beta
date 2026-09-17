package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g implements Utilities.Callback {
    public final int f47127a;
    public final AtomicBoolean f47128b;
    public final of.e f47129c;

    public g(AtomicBoolean atomicBoolean, of.e eVar, int i10) {
        this.f47127a = i10;
        this.f47128b = atomicBoolean;
        this.f47129c = eVar;
    }

    @Override
    public final void run(Object obj) {
        of.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f47127a) {
            case 0:
                if (!this.f47128b.get()) {
                    this.f47129c.b();
                    return;
                }
                return;
            default:
                if (!this.f47128b.get() && (eVar = this.f47129c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
