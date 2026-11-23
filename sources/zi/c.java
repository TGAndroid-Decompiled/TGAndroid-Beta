package zi;
public final class c {
    public final int f62053a;
    public final k0 f62054b;

    public c(k0 k0Var, int i7) {
        this.f62053a = i7;
        this.f62054b = k0Var;
    }

    public void a(Exception exc) {
        switch (this.f62053a) {
            case 0:
                k0 k0Var = this.f62054b;
                ((u0) k0Var.f62193a).f62327i.post(new j0(k0Var, exc, 1));
                return;
            default:
                k0 k0Var2 = this.f62054b;
                ((u0) k0Var2.f62193a).f62327i.post(new j0(k0Var2, exc, 0));
                return;
        }
    }
}
