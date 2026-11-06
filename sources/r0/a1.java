package r0;

import c8.ub;
public abstract class a1 {
    public final k1 f54066a;
    public i0.b[] f54067b;

    public a1() {
        this(new k1());
    }

    public final void a() {
        i0.b[] bVarArr = this.f54067b;
        if (bVarArr != null) {
            i0.b bVar = bVarArr[0];
            i0.b bVar2 = bVarArr[1];
            k1 k1Var = this.f54066a;
            if (bVar2 == null) {
                bVar2 = k1Var.f54109a.f(2);
            }
            if (bVar == null) {
                bVar = k1Var.f54109a.f(1);
            }
            g(i0.b.a(bVar, bVar2));
            i0.b bVar3 = this.f54067b[ub.a(16)];
            if (bVar3 != null) {
                f(bVar3);
            }
            i0.b bVar4 = this.f54067b[ub.a(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            i0.b bVar5 = this.f54067b[ub.a(64)];
            if (bVar5 != null) {
                h(bVar5);
            }
        }
    }

    public abstract k1 b();

    public void c(int i7, i0.b bVar) {
        if (this.f54067b == null) {
            this.f54067b = new i0.b[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                this.f54067b[ub.a(i10)] = bVar;
            }
        }
    }

    public abstract void e(i0.b bVar);

    public abstract void g(i0.b bVar);

    public a1(k1 k1Var) {
        this.f54066a = k1Var;
    }

    public void d(i0.b bVar) {
    }

    public void f(i0.b bVar) {
    }

    public void h(i0.b bVar) {
    }

    public void i(int i7, boolean z9) {
    }
}
