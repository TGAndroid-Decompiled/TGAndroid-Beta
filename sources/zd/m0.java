package zd;
public final class m0 extends e1 {
    public final int f60104e;
    public final Object f60105f;

    public m0(Object obj, int i7) {
        this.f60104e = i7;
        this.f60105f = obj;
    }

    @Override
    public final boolean i() {
        switch (this.f60104e) {
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
        switch (this.f60104e) {
            case 0:
                ((l0) this.f60105f).dispose();
                return;
            case 1:
                ((rd.l) this.f60105f).invoke(th2);
                return;
            case 2:
                n1 n1Var = (n1) this.f60105f;
                n1Var.getClass();
                n1.f60109a.get(n1Var);
                throw null;
            default:
                f1 f1Var = (f1) this.f60105f;
                Object obj = n1.f60109a.get(h());
                if (obj instanceof v) {
                    f1Var.resumeWith(af.b.b(((v) obj).f60130a));
                    return;
                } else {
                    f1Var.resumeWith(b0.w(obj));
                    return;
                }
        }
    }

    public m0(n1 n1Var) {
        this.f60104e = 2;
        this.f60105f = n1Var;
    }
}
