package s4;
public final class c implements d0 {
    public final d0 f45934a;
    public int f45935b = 0;
    public int f45936c = -1;
    public int d = -1;

    public c(d0 d0Var) {
        this.f45934a = d0Var;
    }

    @Override
    public final void X(int i10, int i11) {
        int i12;
        if (this.f45935b == 1 && i10 >= (i12 = this.f45936c)) {
            int i13 = this.d;
            if (i10 <= i12 + i13) {
                this.d = i13 + i11;
                this.f45936c = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.f45936c = i10;
        this.d = i11;
        this.f45935b = 1;
    }

    public final void a() {
        int i10 = this.f45935b;
        if (i10 == 0) {
            return;
        }
        d0 d0Var = this.f45934a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    d0Var.a1(this.f45936c, this.d);
                }
            } else {
                d0Var.t0(this.f45936c, this.d);
            }
        } else {
            d0Var.X(this.f45936c, this.d);
        }
        this.f45935b = 0;
    }

    @Override
    public final void a1(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f45935b == 3 && i10 <= (i13 = this.d + (i12 = this.f45936c)) && (i14 = i10 + i11) >= i12) {
            this.f45936c = Math.min(i10, i12);
            this.d = Math.max(i13, i14) - this.f45936c;
            return;
        }
        a();
        this.f45936c = i10;
        this.d = i11;
        this.f45935b = 3;
    }

    @Override
    public final void t0(int i10, int i11) {
        int i12;
        if (this.f45935b == 2 && (i12 = this.f45936c) >= i10 && i12 <= i10 + i11) {
            this.d += i11;
            this.f45936c = i10;
            return;
        }
        a();
        this.f45936c = i10;
        this.d = i11;
        this.f45935b = 2;
    }

    @Override
    public final void y(int i10, int i11) {
        a();
        this.f45934a.y(i10, i11);
    }
}
