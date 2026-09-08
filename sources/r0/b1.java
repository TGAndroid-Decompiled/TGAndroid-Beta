package r0;

import w7.w6;
public abstract class b1 {
    public final l1 f44692a;
    public i0.c[] f44693b;

    public b1() {
        this(new l1());
    }

    public final void a() {
        i0.c[] cVarArr = this.f44693b;
        if (cVarArr != null) {
            i0.c cVar = cVarArr[0];
            i0.c cVar2 = cVarArr[1];
            l1 l1Var = this.f44692a;
            if (cVar2 == null) {
                cVar2 = l1Var.f44739a.f(2);
            }
            if (cVar == null) {
                cVar = l1Var.f44739a.f(1);
            }
            g(i0.c.a(cVar, cVar2));
            i0.c cVar3 = this.f44693b[w6.a(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            i0.c cVar4 = this.f44693b[w6.a(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            i0.c cVar5 = this.f44693b[w6.a(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract l1 b();

    public void c(int i10, i0.c cVar) {
        if (this.f44693b == null) {
            this.f44693b = new i0.c[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f44693b[w6.a(i11)] = cVar;
            }
        }
    }

    public abstract void e(i0.c cVar);

    public abstract void g(i0.c cVar);

    public b1(l1 l1Var) {
        this.f44692a = l1Var;
    }

    public void d(i0.c cVar) {
    }

    public void f(i0.c cVar) {
    }

    public void h(i0.c cVar) {
    }
}
