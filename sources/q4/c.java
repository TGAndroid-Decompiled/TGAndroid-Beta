package q4;

import h5.d0;
import h5.w;
import j3.n0;
import org.telegram.ui.yh;
import r3.u;
import r3.v;
public final class c implements v {
    public final int f44460a;
    public final n0 f44461b;
    public final r3.j f44462c = new r3.j();
    public n0 d;
    public v f44463e;
    public long f44464f;

    public c(int i10, int i11, n0 n0Var) {
        this.f44460a = i11;
        this.f44461b = n0Var;
    }

    @Override
    public final void a(int i10, w wVar) {
        v vVar = this.f44463e;
        int i11 = d0.f7237a;
        vVar.d(i10, wVar);
    }

    @Override
    public final void b(n0 n0Var) {
        n0 n0Var2 = this.f44461b;
        if (n0Var2 != null) {
            n0Var = n0Var.c(n0Var2);
        }
        this.d = n0Var;
        v vVar = this.f44463e;
        int i10 = d0.f7237a;
        vVar.b(n0Var);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, u uVar) {
        long j11 = this.f44464f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f44463e = this.f44462c;
        }
        v vVar = this.f44463e;
        int i13 = d0.f7237a;
        vVar.c(j10, i10, i11, i12, uVar);
    }

    @Override
    public final void d(int i10, w wVar) {
        yh.a(this, wVar, i10);
    }

    @Override
    public final int e(g5.j jVar, int i10, boolean z4) {
        v vVar = this.f44463e;
        int i11 = d0.f7237a;
        return vVar.e(jVar, i10, z4);
    }
}
