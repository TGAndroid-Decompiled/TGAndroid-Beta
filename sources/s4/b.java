package s4;
public final class b implements c0 {
    public final c0 f47890a;
    public int f47891b = 0;
    public int f47892c = -1;
    public int d = -1;

    public b(c0 c0Var) {
        this.f47890a = c0Var;
    }

    @Override
    public final void E(int i10, int i11) {
        a();
        this.f47890a.E(i10, i11);
    }

    @Override
    public final void Q0(int i10, int i11) {
        int i12;
        if (this.f47891b == 2 && (i12 = this.f47892c) >= i10 && i12 <= i10 + i11) {
            this.d += i11;
            this.f47892c = i10;
            return;
        }
        a();
        this.f47892c = i10;
        this.d = i11;
        this.f47891b = 2;
    }

    public final void a() {
        int i10 = this.f47891b;
        if (i10 == 0) {
            return;
        }
        c0 c0Var = this.f47890a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    c0Var.x1(this.f47892c, this.d);
                }
            } else {
                c0Var.Q0(this.f47892c, this.d);
            }
        } else {
            c0Var.n0(this.f47892c, this.d);
        }
        this.f47891b = 0;
    }

    @Override
    public final void n0(int i10, int i11) {
        int i12;
        if (this.f47891b == 1 && i10 >= (i12 = this.f47892c)) {
            int i13 = this.d;
            if (i10 <= i12 + i13) {
                this.d = i13 + i11;
                this.f47892c = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.f47892c = i10;
        this.d = i11;
        this.f47891b = 1;
    }

    @Override
    public final void x1(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f47891b == 3 && i10 <= (i13 = this.d + (i12 = this.f47892c)) && (i14 = i10 + i11) >= i12) {
            this.f47892c = Math.min(i10, i12);
            this.d = Math.max(i13, i14) - this.f47892c;
            return;
        }
        a();
        this.f47892c = i10;
        this.d = i11;
        this.f47891b = 3;
    }
}
