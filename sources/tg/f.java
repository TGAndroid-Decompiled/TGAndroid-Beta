package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f48393a;
    public final AtomicBoolean f48394b;
    public final of.e f48395c;

    public f(AtomicBoolean atomicBoolean, of.e eVar, int i10) {
        this.f48393a = i10;
        this.f48394b = atomicBoolean;
        this.f48395c = eVar;
    }

    @Override
    public final void run(Object obj) {
        of.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f48393a) {
            case 0:
                if (!this.f48394b.get()) {
                    this.f48395c.b();
                    return;
                }
                return;
            default:
                if (!this.f48394b.get() && (eVar = this.f48395c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
