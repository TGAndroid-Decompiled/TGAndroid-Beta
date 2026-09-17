package ug;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g implements Utilities.Callback {
    public final int f47155a;
    public final AtomicBoolean f47156b;
    public final of.e f47157c;

    public g(AtomicBoolean atomicBoolean, of.e eVar, int i10) {
        this.f47155a = i10;
        this.f47156b = atomicBoolean;
        this.f47157c = eVar;
    }

    @Override
    public final void run(Object obj) {
        of.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f47155a) {
            case 0:
                if (!this.f47156b.get()) {
                    this.f47157c.b();
                    return;
                }
                return;
            default:
                if (!this.f47156b.get() && (eVar = this.f47157c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
