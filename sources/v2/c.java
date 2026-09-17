package v2;

import b2.s;
import c3.g0;
import c3.h0;
import c3.n;
import e2.d0;
import e2.v;
public final class c implements h0 {
    public final int f47286a;
    public final s f47287b;
    public final n f47288c = new n();
    public s d;
    public h0 f47289e;
    public long f47290f;

    public c(int i10, int i11, s sVar) {
        this.f47286a = i11;
        this.f47287b = sVar;
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(s sVar) {
        s sVar2 = this.f47287b;
        if (sVar2 != null) {
            sVar = sVar.d(sVar2);
        }
        this.d = sVar;
        h0 h0Var = this.f47289e;
        String str = d0.f8737a;
        h0Var.b(sVar);
    }

    @Override
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
        long j10 = this.f47290f;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            this.f47289e = this.f47288c;
        }
        h0 h0Var = this.f47289e;
        String str = d0.f8737a;
        h0Var.c(j3, i10, i11, i12, g0Var);
    }

    @Override
    public final void d(int i10, v vVar) {
        a4.a.a(this, vVar, i10);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        h0 h0Var = this.f47289e;
        String str = d0.f8737a;
        return h0Var.a(kVar, i10, z10);
    }

    @Override
    public final void f(v vVar, int i10, int i11) {
        h0 h0Var = this.f47289e;
        String str = d0.f8737a;
        h0Var.d(i10, vVar);
    }
}
