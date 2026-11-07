package zd;
public final class m0 extends e1 {
    public final int f60001e;
    public final Object f60002f;

    public m0(Object obj, int i7) {
        this.f60001e = i7;
        this.f60002f = obj;
    }

    @Override
    public final boolean i() {
        switch (this.f60001e) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final void j(Throwable th2) {
        switch (this.f60001e) {
            case 0:
                ((l0) this.f60002f).dispose();
                return;
            case 1:
                ((rd.l) this.f60002f).invoke(th2);
                return;
            case 2:
                n1 n1Var = (n1) this.f60002f;
                n1Var.getClass();
                n1.f60006a.get(n1Var);
                throw null;
            default:
                f1 f1Var = (f1) this.f60002f;
                Object obj = n1.f60006a.get(h());
                if (obj instanceof v) {
                    f1Var.resumeWith(af.b.b(((v) obj).f60027a));
                    return;
                } else {
                    f1Var.resumeWith(b0.w(obj));
                    return;
                }
        }
    }

    public m0(n1 n1Var) {
        this.f60001e = 2;
        this.f60002f = n1Var;
    }
}
