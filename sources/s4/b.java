package s4;
public final class b implements f0 {
    public final f0 f47620a;
    public int f47621b = 0;
    public int f47622c = -1;
    public int d = -1;

    public b(f0 f0Var) {
        this.f47620a = f0Var;
    }

    @Override
    public final void D(int i10, int i11) {
        a();
        this.f47620a.D(i10, i11);
    }

    @Override
    public final void K0(int i10, int i11) {
        int i12;
        if (this.f47621b == 2 && (i12 = this.f47622c) >= i10 && i12 <= i10 + i11) {
            this.d += i11;
            this.f47622c = i10;
            return;
        }
        a();
        this.f47622c = i10;
        this.d = i11;
        this.f47621b = 2;
    }

    public final void a() {
        int i10 = this.f47621b;
        if (i10 == 0) {
            return;
        }
        f0 f0Var = this.f47620a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    f0Var.j1(this.f47622c, this.d);
                }
            } else {
                f0Var.K0(this.f47622c, this.d);
            }
        } else {
            f0Var.f0(this.f47622c, this.d);
        }
        this.f47621b = 0;
    }

    @Override
    public final void f0(int i10, int i11) {
        int i12;
        if (this.f47621b == 1 && i10 >= (i12 = this.f47622c)) {
            int i13 = this.d;
            if (i10 <= i12 + i13) {
                this.d = i13 + i11;
                this.f47622c = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.f47622c = i10;
        this.d = i11;
        this.f47621b = 1;
    }

    @Override
    public final void j1(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f47621b == 3 && i10 <= (i13 = this.d + (i12 = this.f47622c)) && (i14 = i10 + i11) >= i12) {
            this.f47622c = Math.min(i10, i12);
            this.d = Math.max(i13, i14) - this.f47622c;
            return;
        }
        a();
        this.f47622c = i10;
        this.d = i11;
        this.f47621b = 3;
    }
}
