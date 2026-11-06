package zd;
public final class m0 extends e1 {
    public final int f59996e;
    public final Object f59997f;

    public m0(Object obj, int i7) {
        this.f59996e = i7;
        this.f59997f = obj;
    }

    @Override
    public final boolean i() {
        switch (this.f59996e) {
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
        switch (this.f59996e) {
            case 0:
                ((l0) this.f59997f).dispose();
                return;
            case 1:
                ((rd.l) this.f59997f).invoke(th2);
                return;
            case 2:
                n1 n1Var = (n1) this.f59997f;
                n1Var.getClass();
                n1.f60001a.get(n1Var);
                throw null;
            default:
                f1 f1Var = (f1) this.f59997f;
                Object obj = n1.f60001a.get(h());
                if (obj instanceof v) {
                    f1Var.resumeWith(af.b.b(((v) obj).f60022a));
                    return;
                } else {
                    f1Var.resumeWith(b0.w(obj));
                    return;
                }
        }
    }

    public m0(n1 n1Var) {
        this.f59996e = 2;
        this.f59997f = n1Var;
    }
}
