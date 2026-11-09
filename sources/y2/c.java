package y2;

import e2.u;
import f3.i0;
import f3.j0;
import h2.m0;
import h2.x;
public final class c implements j0 {
    public final int f58888a;
    public final u f58889b;
    public final f3.n f58890c = new f3.n();
    public final d d;
    public u f58891e;
    public j0 f58892f;
    public long f58893g;

    public c(int i7, int i10, u uVar, d dVar) {
        this.f58888a = i10;
        this.f58889b = uVar;
        this.d = dVar;
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        j0 j0Var = this.f58892f;
        String str = m0.f14112a;
        j0Var.b(i7, xVar);
    }

    @Override
    public final void b(int i7, x xVar) {
        com.google.android.recaptcha.internal.a.a(this, xVar, i7);
    }

    @Override
    public final void c(long j3, int i7, int i10, int i11, i0 i0Var) {
        long j10 = this.f58893g;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            this.f58892f = this.f58890c;
        }
        j0 j0Var = this.f58892f;
        String str = m0.f14112a;
        j0Var.c(j3, i7, i10, i11, i0Var);
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z9) {
        return f(nVar, i7, z9);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z9) {
        j0 j0Var = this.f58892f;
        String str = m0.f14112a;
        return j0Var.e(nVar, i7, z9);
    }

    @Override
    public final void g(u uVar) {
        this.d.getClass();
        u uVar2 = this.f58889b;
        if (uVar2 != null) {
            uVar = uVar.d(uVar2);
        }
        this.f58891e = uVar;
        j0 j0Var = this.f58892f;
        String str = m0.f14112a;
        j0Var.g(uVar);
    }

    @Override
    public final void d(long j3) {
    }
}
