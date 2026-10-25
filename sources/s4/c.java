package s4;
public final class c implements e0 {
    public final e0 f47702a;
    public int f47703b = 0;
    public int f47704c = -1;
    public int d = -1;

    public c(e0 e0Var) {
        this.f47702a = e0Var;
    }

    @Override
    public final void A(int i10, int i11) {
        a();
        this.f47702a.A(i10, i11);
    }

    @Override
    public final void N0(int i10, int i11) {
        int i12;
        if (this.f47703b == 2 && (i12 = this.f47704c) >= i10 && i12 <= i10 + i11) {
            this.d += i11;
            this.f47704c = i10;
            return;
        }
        a();
        this.f47704c = i10;
        this.d = i11;
        this.f47703b = 2;
    }

    public final void a() {
        int i10 = this.f47703b;
        if (i10 == 0) {
            return;
        }
        e0 e0Var = this.f47702a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    e0Var.g1(this.f47704c, this.d);
                }
            } else {
                e0Var.N0(this.f47704c, this.d);
            }
        } else {
            e0Var.i0(this.f47704c, this.d);
        }
        this.f47703b = 0;
    }

    @Override
    public final void g1(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f47703b == 3 && i10 <= (i13 = this.d + (i12 = this.f47704c)) && (i14 = i10 + i11) >= i12) {
            this.f47704c = Math.min(i10, i12);
            this.d = Math.max(i13, i14) - this.f47704c;
            return;
        }
        a();
        this.f47704c = i10;
        this.d = i11;
        this.f47703b = 3;
    }

    @Override
    public final void i0(int i10, int i11) {
        int i12;
        if (this.f47703b == 1 && i10 >= (i12 = this.f47704c)) {
            int i13 = this.d;
            if (i10 <= i12 + i13) {
                this.d = i13 + i11;
                this.f47704c = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.f47704c = i10;
        this.d = i11;
        this.f47703b = 1;
    }
}
