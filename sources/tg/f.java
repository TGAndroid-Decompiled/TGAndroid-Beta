package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f implements Utilities.Callback {
    public final int f48368a;
    public final AtomicBoolean f48369b;
    public final of.e f48370c;

    public f(AtomicBoolean atomicBoolean, of.e eVar, int i10) {
        this.f48368a = i10;
        this.f48369b = atomicBoolean;
        this.f48370c = eVar;
    }

    @Override
    public final void run(Object obj) {
        of.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f48368a) {
            case 0:
                if (!this.f48369b.get()) {
                    this.f48370c.b();
                    return;
                }
                return;
            default:
                if (!this.f48369b.get() && (eVar = this.f48370c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
