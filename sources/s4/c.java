package s4;
public final class c implements d0 {
    public final d0 f44855a;
    public int f44856b = 0;
    public int f44857c = -1;
    public int d = -1;

    public c(d0 d0Var) {
        this.f44855a = d0Var;
    }

    @Override
    public final void D(int i10, int i11) {
        a();
        this.f44855a.D(i10, i11);
    }

    @Override
    public final void P0(int i10, int i11) {
        int i12;
        if (this.f44856b == 2 && (i12 = this.f44857c) >= i10 && i12 <= i10 + i11) {
            this.d += i11;
            this.f44857c = i10;
            return;
        }
        a();
        this.f44857c = i10;
        this.d = i11;
        this.f44856b = 2;
    }

    public final void a() {
        int i10 = this.f44856b;
        if (i10 == 0) {
            return;
        }
        d0 d0Var = this.f44855a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    d0Var.m1(this.f44857c, this.d);
                }
            } else {
                d0Var.P0(this.f44857c, this.d);
            }
        } else {
            d0Var.j0(this.f44857c, this.d);
        }
        this.f44856b = 0;
    }

    @Override
    public final void j0(int i10, int i11) {
        int i12;
        if (this.f44856b == 1 && i10 >= (i12 = this.f44857c)) {
            int i13 = this.d;
            if (i10 <= i12 + i13) {
                this.d = i13 + i11;
                this.f44857c = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.f44857c = i10;
        this.d = i11;
        this.f44856b = 1;
    }

    @Override
    public final void m1(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f44856b == 3 && i10 <= (i13 = this.d + (i12 = this.f44857c)) && (i14 = i10 + i11) >= i12) {
            this.f44857c = Math.min(i10, i12);
            this.d = Math.max(i13, i14) - this.f44857c;
            return;
        }
        a();
        this.f44857c = i10;
        this.d = i11;
        this.f44856b = 3;
    }
}
