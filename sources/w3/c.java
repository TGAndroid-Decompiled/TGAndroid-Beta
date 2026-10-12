package w3;

import java.io.IOException;
import java.util.ConcurrentModificationException;
public final class c implements y2.g {
    public final Object f47083a;

    public c(Object obj) {
        this.f47083a = obj;
    }

    @Override
    public k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        ((l2.d) this.f47083a).f14493a.y(iOException);
        return y2.l.e;
    }

    @Override
    public void l(y2.i iVar, long j10, long j11) {
        boolean z10;
        l2.d dVar = (l2.d) this.f47083a;
        synchronized (z2.b.f49245b) {
            z10 = z2.b.f49246c;
        }
        if (!z10) {
            dVar.f14493a.y(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.a();
    }

    @Override
    public void B(y2.i iVar, long j10, long j11, boolean z10) {
    }

    @Override
    public void k(y2.i iVar, long j10, long j11, int i10) {
    }
}
