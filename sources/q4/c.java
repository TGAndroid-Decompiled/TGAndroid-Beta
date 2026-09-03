package q4;

import h5.d0;
import h5.w;
import j3.n0;
import org.telegram.ui.ai;
import r3.u;
import r3.v;
public final class c implements v {
    public final int f42748a;
    public final n0 f42749b;
    public final r3.j f42750c = new r3.j();
    public n0 d;
    public v e;
    public long f42751f;

    public c(int i10, int i11, n0 n0Var) {
        this.f42748a = i11;
        this.f42749b = n0Var;
    }

    @Override
    public final void a(int i10, w wVar) {
        v vVar = this.e;
        int i11 = d0.f6924a;
        vVar.d(i10, wVar);
    }

    @Override
    public final void b(n0 n0Var) {
        n0 n0Var2 = this.f42749b;
        if (n0Var2 != null) {
            n0Var = n0Var.c(n0Var2);
        }
        this.d = n0Var;
        v vVar = this.e;
        int i10 = d0.f6924a;
        vVar.b(n0Var);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, u uVar) {
        long j11 = this.f42751f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.e = this.f42750c;
        }
        v vVar = this.e;
        int i13 = d0.f6924a;
        vVar.c(j10, i10, i11, i12, uVar);
    }

    @Override
    public final void d(int i10, w wVar) {
        ai.a(this, wVar, i10);
    }

    @Override
    public final int e(g5.j jVar, int i10, boolean z4) {
        v vVar = this.e;
        int i11 = d0.f6924a;
        return vVar.e(jVar, i10, z4);
    }
}
