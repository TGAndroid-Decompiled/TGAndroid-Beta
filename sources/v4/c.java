package v4;
public final class c implements e0 {
    public final e0 f59196a;
    public int f59197b = 0;
    public int f59198c = -1;
    public int d = -1;

    public c(e0 e0Var) {
        this.f59196a = e0Var;
    }

    @Override
    public final void V(int i7, int i10) {
        int i11;
        if (this.f59197b == 1 && i7 >= (i11 = this.f59198c)) {
            int i12 = this.d;
            if (i7 <= i11 + i12) {
                this.d = i12 + i10;
                this.f59198c = Math.min(i7, i11);
                return;
            }
        }
        a();
        this.f59198c = i7;
        this.d = i10;
        this.f59197b = 1;
    }

    @Override
    public final void V0(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        if (this.f59197b == 3 && i7 <= (i12 = this.d + (i11 = this.f59198c)) && (i13 = i7 + i10) >= i11) {
            this.f59198c = Math.min(i7, i11);
            this.d = Math.max(i12, i13) - this.f59198c;
            return;
        }
        a();
        this.f59198c = i7;
        this.d = i10;
        this.f59197b = 3;
    }

    public final void a() {
        int i7 = this.f59197b;
        if (i7 == 0) {
            return;
        }
        e0 e0Var = this.f59196a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    e0Var.V0(this.f59198c, this.d);
                }
            } else {
                e0Var.y0(this.f59198c, this.d);
            }
        } else {
            e0Var.V(this.f59198c, this.d);
        }
        this.f59197b = 0;
    }

    @Override
    public final void y0(int i7, int i10) {
        int i11;
        if (this.f59197b == 2 && (i11 = this.f59198c) >= i7 && i11 <= i7 + i10) {
            this.d += i10;
            this.f59198c = i7;
            return;
        }
        a();
        this.f59198c = i7;
        this.d = i10;
        this.f59197b = 2;
    }

    @Override
    public final void z(int i7, int i10) {
        a();
        this.f59196a.z(i7, i10);
    }
}
