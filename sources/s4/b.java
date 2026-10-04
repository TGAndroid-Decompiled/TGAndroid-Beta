package s4;
public final class b implements e0 {
    public final e0 f46506a;
    public int f46507b = 0;
    public int f46508c = -1;
    public int d = -1;

    public b(e0 e0Var) {
        this.f46506a = e0Var;
    }

    @Override
    public final void D(int i10, int i11) {
        a();
        this.f46506a.D(i10, i11);
    }

    @Override
    public final void O0(int i10, int i11) {
        int i12;
        if (this.f46507b == 2 && (i12 = this.f46508c) >= i10 && i12 <= i10 + i11) {
            this.d += i11;
            this.f46508c = i10;
            return;
        }
        a();
        this.f46508c = i10;
        this.d = i11;
        this.f46507b = 2;
    }

    public final void a() {
        int i10 = this.f46507b;
        if (i10 == 0) {
            return;
        }
        e0 e0Var = this.f46506a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    e0Var.n1(this.f46508c, this.d);
                }
            } else {
                e0Var.O0(this.f46508c, this.d);
            }
        } else {
            e0Var.m0(this.f46508c, this.d);
        }
        this.f46507b = 0;
    }

    @Override
    public final void m0(int i10, int i11) {
        int i12;
        if (this.f46507b == 1 && i10 >= (i12 = this.f46508c)) {
            int i13 = this.d;
            if (i10 <= i12 + i13) {
                this.d = i13 + i11;
                this.f46508c = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.f46508c = i10;
        this.d = i11;
        this.f46507b = 1;
    }

    @Override
    public final void n1(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f46507b == 3 && i10 <= (i13 = this.d + (i12 = this.f46508c)) && (i14 = i10 + i11) >= i12) {
            this.f46508c = Math.min(i10, i12);
            this.d = Math.max(i13, i14) - this.f46508c;
            return;
        }
        a();
        this.f46508c = i10;
        this.d = i11;
        this.f46507b = 3;
    }
}
