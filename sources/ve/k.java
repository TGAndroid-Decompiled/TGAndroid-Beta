package ve;

import w7.j8;
public final class k extends df.c {
    public final int f50805g;
    public final String h;
    public final String f50806i;

    public k(int i10, String str, String str2) {
        this.f50805g = i10;
        this.h = str;
        this.f50806i = str2;
    }

    @Override
    public final void a(j8 j8Var) {
        switch (this.f50805g) {
            case 0:
                j8Var.i(this);
                return;
            default:
                j8Var.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        switch (this.f50805g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f50806i;
            default:
                return "destination=" + this.h + ", title=" + this.f50806i;
        }
    }
}
