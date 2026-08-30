package r0;

import k7.q6;
public abstract class c1 {
    public final m1 f43086a;
    public i0.b[] f43087b;

    public c1() {
        this(new m1());
    }

    public final void a() {
        i0.b[] bVarArr = this.f43087b;
        if (bVarArr != null) {
            i0.b bVar = bVarArr[0];
            i0.b bVar2 = bVarArr[1];
            m1 m1Var = this.f43086a;
            if (bVar2 == null) {
                bVar2 = m1Var.f43130a.f(2);
            }
            if (bVar == null) {
                bVar = m1Var.f43130a.f(1);
            }
            g(i0.b.a(bVar, bVar2));
            i0.b bVar3 = this.f43087b[q6.a(16)];
            if (bVar3 != null) {
                f(bVar3);
            }
            i0.b bVar4 = this.f43087b[q6.a(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            i0.b bVar5 = this.f43087b[q6.a(64)];
            if (bVar5 != null) {
                h(bVar5);
            }
        }
    }

    public abstract m1 b();

    public void c(int i10, i0.b bVar) {
        if (this.f43087b == null) {
            this.f43087b = new i0.b[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f43087b[q6.a(i11)] = bVar;
            }
        }
    }

    public abstract void e(i0.b bVar);

    public abstract void g(i0.b bVar);

    public c1(m1 m1Var) {
        this.f43086a = m1Var;
    }

    public void d(i0.b bVar) {
    }

    public void f(i0.b bVar) {
    }

    public void h(i0.b bVar) {
    }
}
