package z2;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import n6.l;
import y2.g;
import y2.i;
public final class b implements g {
    public final Object f51096a;

    public b(x6.a aVar) {
        l.h(aVar);
        this.f51096a = aVar;
    }

    @Override
    public k4.d e(i iVar, long j10, long j11, IOException iOException, int i10) {
        ((l2.d) this.f51096a).f15896a.y(iOException);
        return y2.l.e;
    }

    @Override
    public void k(i iVar, long j10, long j11) {
        boolean z10;
        l2.d dVar = (l2.d) this.f51096a;
        synchronized (c.f51098b) {
            z10 = c.f51099c;
        }
        if (!z10) {
            dVar.f15896a.y(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.a();
    }

    public b(l2.d dVar) {
        this.f51096a = dVar;
    }

    @Override
    public void j(i iVar, long j10, long j11, int i10) {
    }

    @Override
    public void z(i iVar, long j10, long j11, boolean z10) {
    }
}
