package r0;

import w7.x6;
public abstract class b1 {
    public final l1 f42084a;
    public i0.b[] f42085b;

    public b1() {
        this(new l1());
    }

    public final void a() {
        i0.b[] bVarArr = this.f42085b;
        if (bVarArr != null) {
            i0.b bVar = bVarArr[0];
            i0.b bVar2 = bVarArr[1];
            l1 l1Var = this.f42084a;
            if (bVar2 == null) {
                bVar2 = l1Var.f42126a.f(2);
            }
            if (bVar == null) {
                bVar = l1Var.f42126a.f(1);
            }
            g(i0.b.a(bVar, bVar2));
            i0.b bVar3 = this.f42085b[x6.a(16)];
            if (bVar3 != null) {
                f(bVar3);
            }
            i0.b bVar4 = this.f42085b[x6.a(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            i0.b bVar5 = this.f42085b[x6.a(64)];
            if (bVar5 != null) {
                h(bVar5);
            }
        }
    }

    public abstract l1 b();

    public void c(int i10, i0.b bVar) {
        if (this.f42085b == null) {
            this.f42085b = new i0.b[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f42085b[x6.a(i11)] = bVar;
            }
        }
    }

    public abstract void e(i0.b bVar);

    public abstract void g(i0.b bVar);

    public b1(l1 l1Var) {
        this.f42084a = l1Var;
    }

    public void d(i0.b bVar) {
    }

    public void f(i0.b bVar) {
    }

    public void h(i0.b bVar) {
    }
}
