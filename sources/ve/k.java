package ve;

import w7.j8;
public final class k extends df.c {
    public final int f50819g;
    public final String h;
    public final String f50820i;

    public k(int i10, String str, String str2) {
        this.f50819g = i10;
        this.h = str;
        this.f50820i = str2;
    }

    @Override
    public final void a(j8 j8Var) {
        switch (this.f50819g) {
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
        switch (this.f50819g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.f50820i;
            default:
                return "destination=" + this.h + ", title=" + this.f50820i;
        }
    }
}
