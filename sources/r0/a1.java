package r0;

import c8.wb;
public abstract class a1 {
    public final k1 f55639a;
    public i0.c[] f55640b;

    public a1() {
        this(new k1());
    }

    public final void a() {
        i0.c[] cVarArr = this.f55640b;
        if (cVarArr != null) {
            i0.c cVar = cVarArr[0];
            i0.c cVar2 = cVarArr[1];
            k1 k1Var = this.f55639a;
            if (cVar2 == null) {
                cVar2 = k1Var.f55682a.f(2);
            }
            if (cVar == null) {
                cVar = k1Var.f55682a.f(1);
            }
            g(i0.c.a(cVar, cVar2));
            i0.c cVar3 = this.f55640b[wb.a(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            i0.c cVar4 = this.f55640b[wb.a(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            i0.c cVar5 = this.f55640b[wb.a(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract k1 b();

    public void c(int i7, i0.c cVar) {
        if (this.f55640b == null) {
            this.f55640b = new i0.c[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                this.f55640b[wb.a(i10)] = cVar;
            }
        }
    }

    public abstract void e(i0.c cVar);

    public abstract void g(i0.c cVar);

    public a1(k1 k1Var) {
        this.f55639a = k1Var;
    }

    public void d(i0.c cVar) {
    }

    public void f(i0.c cVar) {
    }

    public void h(i0.c cVar) {
    }

    public void i(int i7, boolean z10) {
    }
}
