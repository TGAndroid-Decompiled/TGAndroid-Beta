package y2;

import com.google.android.gms.internal.vision.e2;
import e2.u;
import f3.h0;
import f3.i0;
import h2.l0;
import h2.x;
public final class c implements i0 {
    public final int f60675a;
    public final u f60676b;
    public final f3.n f60677c = new f3.n();
    public final d d;
    public u f60678e;
    public i0 f60679f;
    public long f60680g;

    public c(int i7, int i10, u uVar, d dVar) {
        this.f60675a = i10;
        this.f60676b = uVar;
        this.d = dVar;
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        i0 i0Var = this.f60679f;
        String str = l0.f13778a;
        i0Var.b(i7, xVar);
    }

    @Override
    public final void b(int i7, x xVar) {
        e2.a(this, xVar, i7);
    }

    @Override
    public final void c(long j3, int i7, int i10, int i11, h0 h0Var) {
        long j10 = this.f60680g;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            this.f60679f = this.f60677c;
        }
        i0 i0Var = this.f60679f;
        String str = l0.f13778a;
        i0Var.c(j3, i7, i10, i11, h0Var);
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z10) {
        i0 i0Var = this.f60679f;
        String str = l0.f13778a;
        return i0Var.e(nVar, i7, z10);
    }

    @Override
    public final void g(u uVar) {
        this.d.getClass();
        u uVar2 = this.f60676b;
        if (uVar2 != null) {
            uVar = uVar.d(uVar2);
        }
        this.f60678e = uVar;
        i0 i0Var = this.f60679f;
        String str = l0.f13778a;
        i0Var.g(uVar);
    }

    @Override
    public final void d(long j3) {
    }
}
