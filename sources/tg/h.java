package tg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h implements Utilities.Callback {
    public final int f43100a;
    public final AtomicBoolean f43101b;
    public final nf.e f43102c;

    public h(AtomicBoolean atomicBoolean, nf.e eVar, int i10) {
        this.f43100a = i10;
        this.f43101b = atomicBoolean;
        this.f43102c = eVar;
    }

    @Override
    public final void run(Object obj) {
        nf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f43100a) {
            case 0:
                if (!this.f43101b.get()) {
                    this.f43102c.b();
                    return;
                }
                return;
            default:
                if (!this.f43101b.get() && (eVar = this.f43102c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
