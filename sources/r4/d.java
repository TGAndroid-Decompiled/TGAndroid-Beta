package r4;

import android.net.Uri;
import b4.e0;
import g5.h0;
import g5.j0;
import g5.m0;
import g5.p0;
import java.io.IOException;
public final class d implements h0 {
    public final g f43276a;

    public d(g gVar) {
        this.f43276a = gVar;
    }

    @Override
    public void A(j0 j0Var, long j10, long j11) {
        p0 p0Var = (p0) j0Var;
        g gVar = this.f43276a;
        long j12 = p0Var.f6406a;
        Uri uri = p0Var.d.f6458c;
        ?? obj = new Object();
        gVar.f43289n.getClass();
        gVar.f43293r.n(obj, p0Var.f6408c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.M = ((Long) p0Var.f6409f).longValue() - j10;
        gVar.u(true);
    }

    public void a() {
        long j10;
        g gVar = this.f43276a;
        synchronized (h5.a.f6922i) {
            try {
                if (h5.a.f6923j) {
                    j10 = h5.a.f6924k;
                } else {
                    j10 = -9223372036854775807L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        gVar.M = j10;
        gVar.u(true);
    }

    @Override
    public c4.e m(j0 j0Var, IOException iOException, int i10) {
        p0 p0Var = (p0) j0Var;
        g gVar = this.f43276a;
        e0 e0Var = gVar.f43293r;
        long j10 = p0Var.f6406a;
        Uri uri = p0Var.d.f6458c;
        e0Var.r(new Object(), p0Var.f6408c, iOException, true);
        gVar.f43289n.getClass();
        h5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return m0.e;
    }

    @Override
    public void s(j0 j0Var, long j10, long j11, boolean z4) {
        p0 p0Var = (p0) j0Var;
        long j12 = p0Var.f6406a;
        Uri uri = p0Var.d.f6458c;
        ?? obj = new Object();
        g gVar = this.f43276a;
        gVar.f43289n.getClass();
        gVar.f43293r.l(obj, p0Var.f6408c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
