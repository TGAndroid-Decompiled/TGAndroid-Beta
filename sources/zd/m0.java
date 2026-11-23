package zd;
public final class m0 extends e1 {
    public final int f61878e;
    public final Object f61879f;

    public m0(Object obj, int i7) {
        this.f61878e = i7;
        this.f61879f = obj;
    }

    @Override
    public final boolean i() {
        switch (this.f61878e) {
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
        switch (this.f61878e) {
            case 0:
                ((l0) this.f61879f).dispose();
                return;
            case 1:
                ((rd.l) this.f61879f).invoke(th2);
                return;
            case 2:
                n1 n1Var = (n1) this.f61879f;
                n1Var.getClass();
                n1.f61883a.get(n1Var);
                throw null;
            default:
                f1 f1Var = (f1) this.f61879f;
                Object obj = n1.f61883a.get(h());
                if (obj instanceof v) {
                    f1Var.resumeWith(c8.z.a(((v) obj).f61904a));
                    return;
                } else {
                    f1Var.resumeWith(b0.w(obj));
                    return;
                }
        }
    }

    public m0(n1 n1Var) {
        this.f61878e = 2;
        this.f61879f = n1Var;
    }
}
