package u4;
public final class c implements d0 {
    public final d0 f55520a;
    public int f55521b = 0;
    public int f55522c = -1;
    public int d = -1;

    public c(d0 d0Var) {
        this.f55520a = d0Var;
    }

    @Override
    public final void E(int i3, int i10) {
        a();
        this.f55520a.E(i3, i10);
    }

    @Override
    public final void O0(int i3, int i10) {
        int i11;
        if (this.f55521b == 2 && (i11 = this.f55522c) >= i3 && i11 <= i3 + i10) {
            this.d += i10;
            this.f55522c = i3;
            return;
        }
        a();
        this.f55522c = i3;
        this.d = i10;
        this.f55521b = 2;
    }

    public final void a() {
        int i3 = this.f55521b;
        if (i3 == 0) {
            return;
        }
        d0 d0Var = this.f55520a;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    d0Var.j1(this.f55522c, this.d);
                }
            } else {
                d0Var.O0(this.f55522c, this.d);
            }
        } else {
            d0Var.l0(this.f55522c, this.d);
        }
        this.f55521b = 0;
    }

    @Override
    public final void j1(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        if (this.f55521b == 3 && i3 <= (i12 = this.d + (i11 = this.f55522c)) && (i13 = i3 + i10) >= i11) {
            this.f55522c = Math.min(i3, i11);
            this.d = Math.max(i12, i13) - this.f55522c;
            return;
        }
        a();
        this.f55522c = i3;
        this.d = i10;
        this.f55521b = 3;
    }

    @Override
    public final void l0(int i3, int i10) {
        int i11;
        if (this.f55521b == 1 && i3 >= (i11 = this.f55522c)) {
            int i12 = this.d;
            if (i3 <= i11 + i12) {
                this.d = i12 + i10;
                this.f55522c = Math.min(i3, i11);
                return;
            }
        }
        a();
        this.f55522c = i3;
        this.d = i10;
        this.f55521b = 1;
    }
}
