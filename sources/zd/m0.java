package zd;
public final class m0 extends e1 {
    public final int f60102e;
    public final Object f60103f;

    public m0(Object obj, int i7) {
        this.f60102e = i7;
        this.f60103f = obj;
    }

    @Override
    public final boolean i() {
        switch (this.f60102e) {
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
        switch (this.f60102e) {
            case 0:
                ((l0) this.f60103f).dispose();
                return;
            case 1:
                ((rd.l) this.f60103f).invoke(th2);
                return;
            case 2:
                n1 n1Var = (n1) this.f60103f;
                n1Var.getClass();
                n1.f60107a.get(n1Var);
                throw null;
            default:
                f1 f1Var = (f1) this.f60103f;
                Object obj = n1.f60107a.get(h());
                if (obj instanceof v) {
                    f1Var.resumeWith(af.b.b(((v) obj).f60128a));
                    return;
                } else {
                    f1Var.resumeWith(b0.w(obj));
                    return;
                }
        }
    }

    public m0(n1 n1Var) {
        this.f60102e = 2;
        this.f60103f = n1Var;
    }
}
