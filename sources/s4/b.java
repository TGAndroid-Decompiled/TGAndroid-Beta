package s4;
public final class b implements f0 {
    public final f0 f47664a;
    public int f47665b = 0;
    public int f47666c = -1;
    public int d = -1;

    public b(f0 f0Var) {
        this.f47664a = f0Var;
    }

    @Override
    public final void D(int i10, int i11) {
        a();
        this.f47664a.D(i10, i11);
    }

    @Override
    public final void K0(int i10, int i11) {
        int i12;
        if (this.f47665b == 2 && (i12 = this.f47666c) >= i10 && i12 <= i10 + i11) {
            this.d += i11;
            this.f47666c = i10;
            return;
        }
        a();
        this.f47666c = i10;
        this.d = i11;
        this.f47665b = 2;
    }

    public final void a() {
        int i10 = this.f47665b;
        if (i10 == 0) {
            return;
        }
        f0 f0Var = this.f47664a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    f0Var.j1(this.f47666c, this.d);
                }
            } else {
                f0Var.K0(this.f47666c, this.d);
            }
        } else {
            f0Var.f0(this.f47666c, this.d);
        }
        this.f47665b = 0;
    }

    @Override
    public final void f0(int i10, int i11) {
        int i12;
        if (this.f47665b == 1 && i10 >= (i12 = this.f47666c)) {
            int i13 = this.d;
            if (i10 <= i12 + i13) {
                this.d = i13 + i11;
                this.f47666c = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.f47666c = i10;
        this.d = i11;
        this.f47665b = 1;
    }

    @Override
    public final void j1(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f47665b == 3 && i10 <= (i13 = this.d + (i12 = this.f47666c)) && (i14 = i10 + i11) >= i12) {
            this.f47666c = Math.min(i10, i12);
            this.d = Math.max(i13, i14) - this.f47666c;
            return;
        }
        a();
        this.f47666c = i10;
        this.d = i11;
        this.f47665b = 3;
    }
}
