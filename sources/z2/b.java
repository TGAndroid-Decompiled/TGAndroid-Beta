package z2;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import k4.d;
import org.telegram.ui.y61;
import y2.g;
import y2.i;
import y2.l;
public final class b implements g, y61 {
    public final Object f48350a;

    public b(Object obj) {
        this.f48350a = obj;
    }

    @Override
    public d m(i iVar, long j3, long j10, IOException iOException, int i10) {
        ((l2.d) this.f48350a).f14038a.x(iOException);
        return l.e;
    }

    @Override
    public void o(i iVar, long j3, long j10) {
        boolean z10;
        l2.d dVar = (l2.d) this.f48350a;
        synchronized (c.f48352b) {
            z10 = c.f48353c;
        }
        if (!z10) {
            dVar.f14038a.x(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.a();
    }

    @Override
    public void E(i iVar, long j3, long j10, boolean z10) {
    }

    @Override
    public void n(i iVar, long j3, long j10, int i10) {
    }
}
