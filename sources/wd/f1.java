package wd;
public final class f1 extends m {
    public final n1 f57487r;

    public f1(fd.c cVar, n1 n1Var) {
        super(1, cVar);
        this.f57487r = n1Var;
    }

    @Override
    public final Throwable q(n1 n1Var) {
        Throwable c2;
        n1 n1Var2 = this.f57487r;
        n1Var2.getClass();
        Object obj = n1.f57519a.get(n1Var2);
        if ((obj instanceof h1) && (c2 = ((h1) obj).c()) != null) {
            return c2;
        }
        if (obj instanceof v) {
            return ((v) obj).f57540a;
        }
        return n1Var.getCancellationException();
    }

    @Override
    public final String z() {
        return "AwaitContinuation";
    }
}
