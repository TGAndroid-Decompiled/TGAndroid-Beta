package z2;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import k4.d;
import org.telegram.ui.h71;
import y2.h;
import y2.j;
import y2.m;
public final class b implements h, h71 {
    public final Object f48376a;

    public b(Object obj) {
        this.f48376a = obj;
    }

    @Override
    public d m(j jVar, long j3, long j10, IOException iOException, int i10) {
        ((l2.d) this.f48376a).f14012a.x(iOException);
        return m.e;
    }

    @Override
    public void o(j jVar, long j3, long j10) {
        boolean z10;
        l2.d dVar = (l2.d) this.f48376a;
        synchronized (c.f48378b) {
            z10 = c.f48379c;
        }
        if (!z10) {
            dVar.f14012a.x(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.a();
    }

    @Override
    public void F(j jVar, long j3, long j10, boolean z10) {
    }

    @Override
    public void n(j jVar, long j3, long j10, int i10) {
    }
}
