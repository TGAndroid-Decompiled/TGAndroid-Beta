package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g implements Utilities.Callback {
    public final int f47126a;
    public final AtomicBoolean f47127b;
    public final of.e f47128c;

    public g(AtomicBoolean atomicBoolean, of.e eVar, int i10) {
        this.f47126a = i10;
        this.f47127b = atomicBoolean;
        this.f47128c = eVar;
    }

    @Override
    public final void run(Object obj) {
        of.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f47126a) {
            case 0:
                if (!this.f47127b.get()) {
                    this.f47128c.b();
                    return;
                }
                return;
            default:
                if (!this.f47127b.get() && (eVar = this.f47128c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
