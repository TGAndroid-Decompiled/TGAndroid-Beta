package wg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class e implements c20 {
    public final int f57601a;
    public final AtomicBoolean f57602b;
    public final vf.b f57603c;

    public e(AtomicBoolean atomicBoolean, vf.b bVar, int i7) {
        this.f57601a = i7;
        this.f57602b = atomicBoolean;
        this.f57603c = bVar;
    }

    @Override
    public final void a(Object obj) {
        vf.b bVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f57601a) {
            case 0:
                if (!this.f57602b.get()) {
                    this.f57603c.b();
                    return;
                }
                return;
            default:
                if (!this.f57602b.get() && (bVar = this.f57603c) != null) {
                    bVar.b();
                    return;
                }
                return;
        }
    }
}
