package z2;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import k4.d;
import org.telegram.ui.e71;
import y2.h;
import y2.j;
import y2.m;
public final class b implements h, e71 {
    public final Object f48330a;

    public b(Object obj) {
        this.f48330a = obj;
    }

    @Override
    public d m(j jVar, long j3, long j10, IOException iOException, int i10) {
        ((l2.d) this.f48330a).f13973a.x(iOException);
        return m.e;
    }

    @Override
    public void o(j jVar, long j3, long j10) {
        boolean z10;
        l2.d dVar = (l2.d) this.f48330a;
        synchronized (c.f48332b) {
            z10 = c.f48333c;
        }
        if (!z10) {
            dVar.f13973a.x(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.a();
    }

    @Override
    public void E(j jVar, long j3, long j10, boolean z10) {
    }

    @Override
    public void n(j jVar, long j3, long j10, int i10) {
    }
}
