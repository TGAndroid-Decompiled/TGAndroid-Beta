package x2;

import d2.o;
import d2.v;
import e3.h0;
import e3.i0;
import g2.n0;
import g2.y;
public final class c implements i0 {
    public final int f58132a;
    public final v f58133b;
    public final e3.n f58134c = new e3.n();
    public final d d;
    public v f58135e;
    public i0 f58136f;
    public long f58137g;

    public c(int i3, int i10, v vVar, d dVar) {
        this.f58132a = i10;
        this.f58133b = vVar;
        this.d = dVar;
    }

    @Override
    public final int a(o oVar, int i3, boolean z10) {
        return c(oVar, i3, z10);
    }

    @Override
    public final int c(o oVar, int i3, boolean z10) {
        i0 i0Var = this.f58136f;
        String str = n0.f11873a;
        return i0Var.a(oVar, i3, z10);
    }

    @Override
    public final void d(long j10, int i3, int i10, int i11, h0 h0Var) {
        long j11 = this.f58137g;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f58136f = this.f58134c;
        }
        i0 i0Var = this.f58136f;
        String str = n0.f11873a;
        i0Var.d(j10, i3, i10, i11, h0Var);
    }

    @Override
    public final void e(int i3, y yVar) {
        com.google.android.recaptcha.internal.a.a(this, yVar, i3);
    }

    @Override
    public final void f(y yVar, int i3, int i10) {
        i0 i0Var = this.f58136f;
        String str = n0.f11873a;
        i0Var.e(i3, yVar);
    }

    @Override
    public final void g(v vVar) {
        this.d.getClass();
        v vVar2 = this.f58133b;
        if (vVar2 != null) {
            vVar = vVar.d(vVar2);
        }
        this.f58135e = vVar;
        i0 i0Var = this.f58136f;
        String str = n0.f11873a;
        i0Var.g(vVar);
    }

    @Override
    public final void b(long j10) {
    }
}
