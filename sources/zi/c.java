package zi;
public final class c {
    public final int f62043a;
    public final k0 f62044b;

    public c(k0 k0Var, int i7) {
        this.f62043a = i7;
        this.f62044b = k0Var;
    }

    public void a(Exception exc) {
        switch (this.f62043a) {
            case 0:
                k0 k0Var = this.f62044b;
                ((u0) k0Var.f62183a).f62317i.post(new j0(k0Var, exc, 1));
                return;
            default:
                k0 k0Var2 = this.f62044b;
                ((u0) k0Var2.f62183a).f62317i.post(new j0(k0Var2, exc, 0));
                return;
        }
    }
}
