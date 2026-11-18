package zi;
public final class c {
    public final int f62042a;
    public final k0 f62043b;

    public c(k0 k0Var, int i7) {
        this.f62042a = i7;
        this.f62043b = k0Var;
    }

    public void a(Exception exc) {
        switch (this.f62042a) {
            case 0:
                k0 k0Var = this.f62043b;
                ((u0) k0Var.f62182a).f62316i.post(new j0(k0Var, exc, 1));
                return;
            default:
                k0 k0Var2 = this.f62043b;
                ((u0) k0Var2.f62182a).f62316i.post(new j0(k0Var2, exc, 0));
                return;
        }
    }
}
