package r0;

import w7.w6;
public abstract class z0 {
    public final j1 f46165a;
    public i0.c[] f46166b;

    public z0() {
        this(new j1());
    }

    public final void a() {
        i0.c[] cVarArr = this.f46166b;
        if (cVarArr != null) {
            i0.c cVar = cVarArr[0];
            i0.c cVar2 = cVarArr[1];
            j1 j1Var = this.f46165a;
            if (cVar2 == null) {
                cVar2 = j1Var.f46132a.f(2);
            }
            if (cVar == null) {
                cVar = j1Var.f46132a.f(1);
            }
            g(i0.c.a(cVar, cVar2));
            i0.c cVar3 = this.f46166b[w6.a(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            i0.c cVar4 = this.f46166b[w6.a(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            i0.c cVar5 = this.f46166b[w6.a(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract j1 b();

    public void c(int i10, i0.c cVar) {
        if (this.f46166b == null) {
            this.f46166b = new i0.c[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f46166b[w6.a(i11)] = cVar;
            }
        }
    }

    public abstract void e(i0.c cVar);

    public abstract void g(i0.c cVar);

    public z0(j1 j1Var) {
        this.f46165a = j1Var;
    }

    public void d(i0.c cVar) {
    }

    public void f(i0.c cVar) {
    }

    public void h(i0.c cVar) {
    }

    public void i(int i10, boolean z10) {
    }
}
