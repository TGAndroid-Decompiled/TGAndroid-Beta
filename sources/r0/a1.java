package r0;
public abstract class a1 {
    public final k1 f53983a;
    public i0.b[] f53984b;

    public a1() {
        this(new k1());
    }

    public final void a() {
        i0.b[] bVarArr = this.f53984b;
        if (bVarArr != null) {
            i0.b bVar = bVarArr[0];
            i0.b bVar2 = bVarArr[1];
            k1 k1Var = this.f53983a;
            if (bVar2 == null) {
                bVar2 = k1Var.f54026a.f(2);
            }
            if (bVar == null) {
                bVar = k1Var.f54026a.f(1);
            }
            g(i0.b.a(bVar, bVar2));
            i0.b bVar3 = this.f53984b[x7.l.a(16)];
            if (bVar3 != null) {
                f(bVar3);
            }
            i0.b bVar4 = this.f53984b[x7.l.a(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            i0.b bVar5 = this.f53984b[x7.l.a(64)];
            if (bVar5 != null) {
                h(bVar5);
            }
        }
    }

    public abstract k1 b();

    public void c(int i3, i0.b bVar) {
        if (this.f53984b == null) {
            this.f53984b = new i0.b[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i3 & i10) != 0) {
                this.f53984b[x7.l.a(i10)] = bVar;
            }
        }
    }

    public abstract void e(i0.b bVar);

    public abstract void g(i0.b bVar);

    public a1(k1 k1Var) {
        this.f53983a = k1Var;
    }

    public void d(i0.b bVar) {
    }

    public void f(i0.b bVar) {
    }

    public void h(i0.b bVar) {
    }

    public void i(int i3, boolean z10) {
    }
}
