package zi;
public final class c {
    public final int f62088a;
    public final k0 f62089b;

    public c(k0 k0Var, int i7) {
        this.f62088a = i7;
        this.f62089b = k0Var;
    }

    public void a(Exception exc) {
        switch (this.f62088a) {
            case 0:
                k0 k0Var = this.f62089b;
                ((u0) k0Var.f62228a).f62362i.post(new j0(k0Var, exc, 1));
                return;
            default:
                k0 k0Var2 = this.f62089b;
                ((u0) k0Var2.f62228a).f62362i.post(new j0(k0Var2, exc, 0));
                return;
        }
    }
}
