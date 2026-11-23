package r0;

import c8.zb;
public abstract class a1 {
    public final l1 f56258a;
    public i0.b[] f56259b;

    public a1() {
        this(new l1());
    }

    public final void a() {
        i0.b[] bVarArr = this.f56259b;
        if (bVarArr != null) {
            i0.b bVar = bVarArr[0];
            i0.b bVar2 = bVarArr[1];
            l1 l1Var = this.f56258a;
            if (bVar2 == null) {
                bVar2 = l1Var.f56303a.f(2);
            }
            if (bVar == null) {
                bVar = l1Var.f56303a.f(1);
            }
            g(i0.b.a(bVar, bVar2));
            i0.b bVar3 = this.f56259b[zb.a(16)];
            if (bVar3 != null) {
                f(bVar3);
            }
            i0.b bVar4 = this.f56259b[zb.a(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            i0.b bVar5 = this.f56259b[zb.a(64)];
            if (bVar5 != null) {
                h(bVar5);
            }
        }
    }

    public abstract l1 b();

    public void c(int i7, i0.b bVar) {
        if (this.f56259b == null) {
            this.f56259b = new i0.b[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                this.f56259b[zb.a(i10)] = bVar;
            }
        }
    }

    public abstract void e(i0.b bVar);

    public abstract void g(i0.b bVar);

    public a1(l1 l1Var) {
        this.f56258a = l1Var;
    }

    public void d(i0.b bVar) {
    }

    public void f(i0.b bVar) {
    }

    public void h(i0.b bVar) {
    }

    public void i(int i7, boolean z10) {
    }
}
