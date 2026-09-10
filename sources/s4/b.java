package s4;
public final class b implements e0 {
    public final e0 f41586a;
    public int f41587b = 0;
    public int f41588c = -1;
    public int d = -1;

    public b(e0 e0Var) {
        this.f41586a = e0Var;
    }

    @Override
    public final void C(int i10, int i11) {
        a();
        this.f41586a.C(i10, i11);
    }

    @Override
    public final void O0(int i10, int i11) {
        int i12;
        if (this.f41587b == 2 && (i12 = this.f41588c) >= i10 && i12 <= i10 + i11) {
            this.d += i11;
            this.f41588c = i10;
            return;
        }
        a();
        this.f41588c = i10;
        this.d = i11;
        this.f41587b = 2;
    }

    public final void a() {
        int i10 = this.f41587b;
        if (i10 == 0) {
            return;
        }
        e0 e0Var = this.f41586a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    e0Var.k1(this.f41588c, this.d);
                }
            } else {
                e0Var.O0(this.f41588c, this.d);
            }
        } else {
            e0Var.j0(this.f41588c, this.d);
        }
        this.f41587b = 0;
    }

    @Override
    public final void j0(int i10, int i11) {
        int i12;
        if (this.f41587b == 1 && i10 >= (i12 = this.f41588c)) {
            int i13 = this.d;
            if (i10 <= i12 + i13) {
                this.d = i13 + i11;
                this.f41588c = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.f41588c = i10;
        this.d = i11;
        this.f41587b = 1;
    }

    @Override
    public final void k1(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f41587b == 3 && i10 <= (i13 = this.d + (i12 = this.f41588c)) && (i14 = i10 + i11) >= i12) {
            this.f41588c = Math.min(i10, i12);
            this.d = Math.max(i13, i14) - this.f41588c;
            return;
        }
        a();
        this.f41588c = i10;
        this.d = i11;
        this.f41587b = 3;
    }
}
