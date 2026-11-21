package zi;
public final class c {
    public final int f62084a;
    public final k0 f62085b;

    public c(k0 k0Var, int i7) {
        this.f62084a = i7;
        this.f62085b = k0Var;
    }

    public void a(Exception exc) {
        switch (this.f62084a) {
            case 0:
                k0 k0Var = this.f62085b;
                ((u0) k0Var.f62224a).f62358i.post(new j0(k0Var, exc, 1));
                return;
            default:
                k0 k0Var2 = this.f62085b;
                ((u0) k0Var2.f62224a).f62358i.post(new j0(k0Var2, exc, 0));
                return;
        }
    }
}
