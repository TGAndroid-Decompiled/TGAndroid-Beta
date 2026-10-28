package vi;

import li.e3;
public final class c {
    public final int f50375a;
    public final e3 f50376b;

    public c(e3 e3Var, int i10) {
        this.f50375a = i10;
        this.f50376b = e3Var;
    }

    public void a(Exception exc) {
        switch (this.f50375a) {
            case 0:
                e3 e3Var = this.f50376b;
                ((u0) e3Var.f17209b).f50639i.post(new j0(e3Var, exc, 1));
                return;
            default:
                e3 e3Var2 = this.f50376b;
                ((u0) e3Var2.f17209b).f50639i.post(new j0(e3Var2, exc, 0));
                return;
        }
    }
}
