package v4;
public final class b implements d0 {
    public final d0 f57009a;
    public int f57010b = 0;
    public int f57011c = -1;
    public int d = -1;

    public b(d0 d0Var) {
        this.f57009a = d0Var;
    }

    @Override
    public final void E(int i7, int i10) {
        a();
        this.f57009a.E(i7, i10);
    }

    @Override
    public final void M0(int i7, int i10) {
        int i11;
        if (this.f57010b == 2 && (i11 = this.f57011c) >= i7 && i11 <= i7 + i10) {
            this.d += i10;
            this.f57011c = i7;
            return;
        }
        a();
        this.f57011c = i7;
        this.d = i10;
        this.f57010b = 2;
    }

    public final void a() {
        int i7 = this.f57010b;
        if (i7 == 0) {
            return;
        }
        d0 d0Var = this.f57009a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    d0Var.k1(this.f57011c, this.d);
                }
            } else {
                d0Var.M0(this.f57011c, this.d);
            }
        } else {
            d0Var.o0(this.f57011c, this.d);
        }
        this.f57010b = 0;
    }

    @Override
    public final void k1(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        if (this.f57010b == 3 && i7 <= (i12 = this.d + (i11 = this.f57011c)) && (i13 = i7 + i10) >= i11) {
            this.f57011c = Math.min(i7, i11);
            this.d = Math.max(i12, i13) - this.f57011c;
            return;
        }
        a();
        this.f57011c = i7;
        this.d = i10;
        this.f57010b = 3;
    }

    @Override
    public final void o0(int i7, int i10) {
        int i11;
        if (this.f57010b == 1 && i7 >= (i11 = this.f57011c)) {
            int i12 = this.d;
            if (i7 <= i11 + i12) {
                this.d = i12 + i10;
                this.f57011c = Math.min(i7, i11);
                return;
            }
        }
        a();
        this.f57011c = i7;
        this.d = i10;
        this.f57010b = 1;
    }
}
