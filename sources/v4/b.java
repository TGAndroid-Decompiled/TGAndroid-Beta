package v4;
public final class b implements e0 {
    public final e0 f59061a;
    public int f59062b = 0;
    public int f59063c = -1;
    public int d = -1;

    public b(e0 e0Var) {
        this.f59061a = e0Var;
    }

    @Override
    public final void F(int i7, int i10) {
        a();
        this.f59061a.F(i7, i10);
    }

    @Override
    public final void M0(int i7, int i10) {
        int i11;
        if (this.f59062b == 2 && (i11 = this.f59063c) >= i7 && i11 <= i7 + i10) {
            this.d += i10;
            this.f59063c = i7;
            return;
        }
        a();
        this.f59063c = i7;
        this.d = i10;
        this.f59062b = 2;
    }

    public final void a() {
        int i7 = this.f59062b;
        if (i7 == 0) {
            return;
        }
        e0 e0Var = this.f59061a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    e0Var.g1(this.f59063c, this.d);
                }
            } else {
                e0Var.M0(this.f59063c, this.d);
            }
        } else {
            e0Var.g0(this.f59063c, this.d);
        }
        this.f59062b = 0;
    }

    @Override
    public final void g0(int i7, int i10) {
        int i11;
        if (this.f59062b == 1 && i7 >= (i11 = this.f59063c)) {
            int i12 = this.d;
            if (i7 <= i11 + i12) {
                this.d = i12 + i10;
                this.f59063c = Math.min(i7, i11);
                return;
            }
        }
        a();
        this.f59063c = i7;
        this.d = i10;
        this.f59062b = 1;
    }

    @Override
    public final void g1(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        if (this.f59062b == 3 && i7 <= (i12 = this.d + (i11 = this.f59063c)) && (i13 = i7 + i10) >= i11) {
            this.f59063c = Math.min(i7, i11);
            this.d = Math.max(i12, i13) - this.f59063c;
            return;
        }
        a();
        this.f59063c = i7;
        this.d = i10;
        this.f59062b = 3;
    }
}
