package vi;

import android.os.SystemClock;
import android.support.v4.media.session.a0;
import b8.gg;
import b8.kg;
import b8.lb;
import b8.me;
import b8.nb;
import java.io.File;
public final class f implements gg {
    public final long f56971a;
    public final Object f56972b;
    public final Object f56973c;

    public f(xb.d dVar, nb nbVar, long j10) {
        this.f56972b = dVar;
        this.f56973c = nbVar;
        this.f56971a = j10;
    }

    @Override
    public kg zza() {
        fa.f fVar = new fa.f(1);
        fVar.d = lb.TYPE_THIN;
        a0 a0Var = new a0(10, false);
        a0Var.d = ((xb.d) this.f56972b).f58601e.a();
        a0Var.f1186b = (nb) this.f56973c;
        a0Var.f1187c = Long.valueOf((SystemClock.elapsedRealtime() - this.f56971a) & Long.MAX_VALUE);
        fVar.f11542f = new me(a0Var);
        return new kg(fVar, 0);
    }

    public f(File file, long j10, byte[] bArr) {
        this.f56972b = file;
        this.f56971a = j10;
        this.f56973c = bArr == null ? null : (byte[]) bArr.clone();
    }

    public f(long j10, i iVar, j jVar) {
        this.f56973c = jVar;
        this.f56971a = j10;
        this.f56972b = iVar;
    }
}
