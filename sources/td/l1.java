package td;
public final class l1 extends m {
    public final u1 f48649r;

    public l1(cd.c cVar, u1 u1Var) {
        super(1, cVar);
        this.f48649r = u1Var;
    }

    @Override
    public final Throwable q(u1 u1Var) {
        Throwable b10;
        Object u10 = this.f48649r.u();
        if ((u10 instanceof n1) && (b10 = ((n1) u10).b()) != null) {
            return b10;
        }
        if (u10 instanceof v) {
            return ((v) u10).f48682a;
        }
        return u1Var.getCancellationException();
    }

    @Override
    public final String z() {
        return "AwaitContinuation";
    }
}
