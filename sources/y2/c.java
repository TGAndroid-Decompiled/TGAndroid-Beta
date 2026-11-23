package y2;

import com.google.android.gms.internal.vision.e2;
import e2.u;
import f3.i0;
import f3.j0;
import h2.l0;
import h2.x;
public final class c implements j0 {
    public final int f60793a;
    public final u f60794b;
    public final f3.n f60795c = new f3.n();
    public final d d;
    public u f60796e;
    public j0 f60797f;
    public long f60798g;

    public c(int i7, int i10, u uVar, d dVar) {
        this.f60793a = i10;
        this.f60794b = uVar;
        this.d = dVar;
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        j0 j0Var = this.f60797f;
        String str = l0.f13778a;
        j0Var.b(i7, xVar);
    }

    @Override
    public final void b(int i7, x xVar) {
        e2.a(this, xVar, i7);
    }

    @Override
    public final void c(long j3, int i7, int i10, int i11, i0 i0Var) {
        long j10 = this.f60798g;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            this.f60797f = this.f60795c;
        }
        j0 j0Var = this.f60797f;
        String str = l0.f13778a;
        j0Var.c(j3, i7, i10, i11, i0Var);
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z10) {
        j0 j0Var = this.f60797f;
        String str = l0.f13778a;
        return j0Var.e(nVar, i7, z10);
    }

    @Override
    public final void g(u uVar) {
        this.d.getClass();
        u uVar2 = this.f60794b;
        if (uVar2 != null) {
            uVar = uVar.d(uVar2);
        }
        this.f60796e = uVar;
        j0 j0Var = this.f60797f;
        String str = l0.f13778a;
        j0Var.g(uVar);
    }

    @Override
    public final void d(long j3) {
    }
}
