package zi;

import y7.h7;
public final class c {
    public final int f62171a;
    public final h7 f62172b;

    public c(h7 h7Var, int i7) {
        this.f62171a = i7;
        this.f62172b = h7Var;
    }

    public void a(Exception exc) {
        switch (this.f62171a) {
            case 0:
                h7 h7Var = this.f62172b;
                ((u0) h7Var.f60952a).f62447i.post(new j0(h7Var, exc, 1));
                return;
            default:
                h7 h7Var2 = this.f62172b;
                ((u0) h7Var2.f60952a).f62447i.post(new j0(h7Var2, exc, 0));
                return;
        }
    }
}
