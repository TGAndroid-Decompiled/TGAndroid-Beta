package r4;

import android.net.Uri;
import b4.e0;
import g5.h0;
import g5.j0;
import g5.m0;
import g5.p0;
import java.io.IOException;
public final class d implements h0 {
    public final g f46647a;

    public d(g gVar) {
        this.f46647a = gVar;
    }

    public void a() {
        long j10;
        g gVar = this.f46647a;
        synchronized (h5.a.f7222i) {
            try {
                if (h5.a.f7223j) {
                    j10 = h5.a.f7224k;
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
    public c4.e q(j0 j0Var, IOException iOException, int i10) {
        p0 p0Var = (p0) j0Var;
        g gVar = this.f46647a;
        e0 e0Var = gVar.f46665r;
        long j10 = p0Var.f6891a;
        Uri uri = p0Var.d.f6950c;
        e0Var.s(new Object(), p0Var.f6893c, iOException, true);
        gVar.f46661n.getClass();
        h5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return m0.f6873e;
    }

    @Override
    public void u(j0 j0Var, long j10, long j11, boolean z4) {
        p0 p0Var = (p0) j0Var;
        long j12 = p0Var.f6891a;
        Uri uri = p0Var.d.f6950c;
        ?? obj = new Object();
        g gVar = this.f46647a;
        gVar.f46661n.getClass();
        gVar.f46665r.m(obj, p0Var.f6893c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public void x(j0 j0Var, long j10, long j11) {
        p0 p0Var = (p0) j0Var;
        g gVar = this.f46647a;
        long j12 = p0Var.f6891a;
        Uri uri = p0Var.d.f6950c;
        ?? obj = new Object();
        gVar.f46661n.getClass();
        gVar.f46665r.p(obj, p0Var.f6893c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.M = ((Long) p0Var.f6895f).longValue() - j10;
        gVar.u(true);
    }
}
