package zd;
public final class m0 extends e1 {
    public final int f61868e;
    public final Object f61869f;

    public m0(Object obj, int i7) {
        this.f61868e = i7;
        this.f61869f = obj;
    }

    @Override
    public final boolean i() {
        switch (this.f61868e) {
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
        switch (this.f61868e) {
            case 0:
                ((l0) this.f61869f).dispose();
                return;
            case 1:
                ((rd.l) this.f61869f).invoke(th2);
                return;
            case 2:
                n1 n1Var = (n1) this.f61869f;
                n1Var.getClass();
                n1.f61873a.get(n1Var);
                throw null;
            default:
                f1 f1Var = (f1) this.f61869f;
                Object obj = n1.f61873a.get(h());
                if (obj instanceof v) {
                    f1Var.resumeWith(b7.h.a(((v) obj).f61894a));
                    return;
                } else {
                    f1Var.resumeWith(b0.w(obj));
                    return;
                }
        }
    }

    public m0(n1 n1Var) {
        this.f61868e = 2;
        this.f61869f = n1Var;
    }
}
