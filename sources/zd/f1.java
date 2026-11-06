package zd;
public final class f1 extends m {
    public final n1 f59968r;

    public f1(id.c cVar, n1 n1Var) {
        super(1, cVar);
        this.f59968r = n1Var;
    }

    @Override
    public final Throwable q(n1 n1Var) {
        Throwable c10;
        n1 n1Var2 = this.f59968r;
        n1Var2.getClass();
        Object obj = n1.f60000a.get(n1Var2);
        if ((obj instanceof h1) && (c10 = ((h1) obj).c()) != null) {
            return c10;
        }
        if (obj instanceof v) {
            return ((v) obj).f60021a;
        }
        return n1Var.getCancellationException();
    }

    @Override
    public final String z() {
        return "AwaitContinuation";
    }
}
