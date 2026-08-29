package r0;

import i7.g7;
public abstract class c1 {
    public final m1 f46794a;
    public i0.b[] f46795b;

    public c1() {
        this(new m1());
    }

    public final void a() {
        i0.b[] bVarArr = this.f46795b;
        if (bVarArr != null) {
            i0.b bVar = bVarArr[0];
            i0.b bVar2 = bVarArr[1];
            m1 m1Var = this.f46794a;
            if (bVar2 == null) {
                bVar2 = m1Var.f46843a.f(2);
            }
            if (bVar == null) {
                bVar = m1Var.f46843a.f(1);
            }
            g(i0.b.a(bVar, bVar2));
            i0.b bVar3 = this.f46795b[g7.a(16)];
            if (bVar3 != null) {
                f(bVar3);
            }
            i0.b bVar4 = this.f46795b[g7.a(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            i0.b bVar5 = this.f46795b[g7.a(64)];
            if (bVar5 != null) {
                h(bVar5);
            }
        }
    }

    public abstract m1 b();

    public void c(int i10, i0.b bVar) {
        if (this.f46795b == null) {
            this.f46795b = new i0.b[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f46795b[g7.a(i11)] = bVar;
            }
        }
    }

    public abstract void e(i0.b bVar);

    public abstract void g(i0.b bVar);

    public c1(m1 m1Var) {
        this.f46794a = m1Var;
    }

    public void d(i0.b bVar) {
    }

    public void f(i0.b bVar) {
    }

    public void h(i0.b bVar) {
    }
}
