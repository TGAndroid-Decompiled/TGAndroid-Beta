package r0;

import h7.s6;

public abstract class c1 {

    public final m1 f46570a;

    public i0.c[] f46571b;

    public c1() {
        this(new m1());
    }

    public final void a() {
        i0.c[] cVarArr = this.f46571b;
        if (cVarArr != null) {
            i0.c cVarF = cVarArr[0];
            i0.c cVarF2 = cVarArr[1];
            m1 m1Var = this.f46570a;
            if (cVarF2 == null) {
                cVarF2 = m1Var.f46619a.f(2);
            }
            if (cVarF == null) {
                cVarF = m1Var.f46619a.f(1);
            }
            g(i0.c.a(cVarF, cVarF2));
            i0.c cVar = this.f46571b[s6.a(16)];
            if (cVar != null) {
                f(cVar);
            }
            i0.c cVar2 = this.f46571b[s6.a(32)];
            if (cVar2 != null) {
                d(cVar2);
            }
            i0.c cVar3 = this.f46571b[s6.a(64)];
            if (cVar3 != null) {
                h(cVar3);
            }
        }
    }

    public abstract m1 b();

    public void c(int i10, i0.c cVar) {
        if (this.f46571b == null) {
            this.f46571b = new i0.c[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f46571b[s6.a(i11)] = cVar;
            }
        }
    }

    public abstract void e(i0.c cVar);

    public abstract void g(i0.c cVar);

    public c1(m1 m1Var) {
        this.f46570a = m1Var;
    }

    public void d(i0.c cVar) {
    }

    public void f(i0.c cVar) {
    }

    public void h(i0.c cVar) {
    }
}
