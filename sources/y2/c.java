package y2;

import com.google.android.gms.internal.vision.e2;
import e2.u;
import f3.h0;
import f3.i0;
import h2.l0;
import h2.x;
public final class c implements i0 {
    public final int f60099a;
    public final u f60100b;
    public final f3.n f60101c = new f3.n();
    public final d d;
    public u f60102e;
    public i0 f60103f;
    public long f60104g;

    public c(int i7, int i10, u uVar, d dVar) {
        this.f60099a = i10;
        this.f60100b = uVar;
        this.d = dVar;
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        i0 i0Var = this.f60103f;
        String str = l0.f13471a;
        i0Var.b(i7, xVar);
    }

    @Override
    public final void b(int i7, x xVar) {
        e2.a(this, xVar, i7);
    }

    @Override
    public final void c(long j3, int i7, int i10, int i11, h0 h0Var) {
        long j10 = this.f60104g;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            this.f60103f = this.f60101c;
        }
        i0 i0Var = this.f60103f;
        String str = l0.f13471a;
        i0Var.c(j3, i7, i10, i11, h0Var);
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z10) {
        i0 i0Var = this.f60103f;
        String str = l0.f13471a;
        return i0Var.e(nVar, i7, z10);
    }

    @Override
    public final void g(u uVar) {
        this.d.getClass();
        u uVar2 = this.f60100b;
        if (uVar2 != null) {
            uVar = uVar.d(uVar2);
        }
        this.f60102e = uVar;
        i0 i0Var = this.f60103f;
        String str = l0.f13471a;
        i0Var.g(uVar);
    }

    @Override
    public final void d(long j3) {
    }
}
