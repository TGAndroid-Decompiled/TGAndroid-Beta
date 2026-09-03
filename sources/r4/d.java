package r4;

import android.net.Uri;
import b4.e0;
import g5.h0;
import g5.j0;
import g5.m0;
import g5.p0;
import java.io.IOException;
public final class d implements h0 {
    public final g f43300a;

    public d(g gVar) {
        this.f43300a = gVar;
    }

    @Override
    public c4.e X(j0 j0Var, IOException iOException, int i10) {
        p0 p0Var = (p0) j0Var;
        g gVar = this.f43300a;
        e0 e0Var = gVar.f43317r;
        long j10 = p0Var.f6406a;
        Uri uri = p0Var.d.f6458c;
        e0Var.s(new Object(), p0Var.f6408c, iOException, true);
        gVar.f43313n.getClass();
        h5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return m0.e;
    }

    public void a() {
        long j10;
        g gVar = this.f43300a;
        synchronized (h5.a.f6909i) {
            try {
                if (h5.a.f6910j) {
                    j10 = h5.a.f6911k;
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
    public void k1(j0 j0Var, long j10, long j11) {
        p0 p0Var = (p0) j0Var;
        g gVar = this.f43300a;
        long j12 = p0Var.f6406a;
        Uri uri = p0Var.d.f6458c;
        ?? obj = new Object();
        gVar.f43313n.getClass();
        gVar.f43317r.p(obj, p0Var.f6408c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.M = ((Long) p0Var.f6409f).longValue() - j10;
        gVar.u(true);
    }

    @Override
    public void x0(j0 j0Var, long j10, long j11, boolean z4) {
        p0 p0Var = (p0) j0Var;
        long j12 = p0Var.f6406a;
        Uri uri = p0Var.d.f6458c;
        ?? obj = new Object();
        g gVar = this.f43300a;
        gVar.f43313n.getClass();
        gVar.f43317r.m(obj, p0Var.f6408c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
