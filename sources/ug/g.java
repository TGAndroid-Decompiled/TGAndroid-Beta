package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g implements Utilities.Callback {
    public final int f47154a;
    public final AtomicBoolean f47155b;
    public final of.e f47156c;

    public g(AtomicBoolean atomicBoolean, of.e eVar, int i10) {
        this.f47154a = i10;
        this.f47155b = atomicBoolean;
        this.f47156c = eVar;
    }

    @Override
    public final void run(Object obj) {
        of.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f47154a) {
            case 0:
                if (!this.f47155b.get()) {
                    this.f47156c.b();
                    return;
                }
                return;
            default:
                if (!this.f47155b.get() && (eVar = this.f47156c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
