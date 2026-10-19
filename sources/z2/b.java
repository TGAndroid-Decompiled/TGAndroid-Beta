package z2;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import n6.l;
import y2.g;
import y2.i;
public final class b implements g {
    public final Object f50626a;

    public b(x6.a aVar) {
        l.h(aVar);
        this.f50626a = aVar;
    }

    @Override
    public k4.d e(i iVar, long j10, long j11, IOException iOException, int i10) {
        ((l2.d) this.f50626a).f15835a.y(iOException);
        return y2.l.e;
    }

    @Override
    public void k(i iVar, long j10, long j11) {
        boolean z10;
        l2.d dVar = (l2.d) this.f50626a;
        synchronized (c.f50628b) {
            z10 = c.f50629c;
        }
        if (!z10) {
            dVar.f15835a.y(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.a();
    }

    public b(l2.d dVar) {
        this.f50626a = dVar;
    }

    @Override
    public void J(i iVar, long j10, long j11, boolean z10) {
    }

    @Override
    public void h(i iVar, long j10, long j11, int i10) {
    }
}
