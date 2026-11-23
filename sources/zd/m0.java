package zd;
public final class m0 extends e1 {
    public final int f61913e;
    public final Object f61914f;

    public m0(Object obj, int i7) {
        this.f61913e = i7;
        this.f61914f = obj;
    }

    @Override
    public final boolean i() {
        switch (this.f61913e) {
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
        switch (this.f61913e) {
            case 0:
                ((l0) this.f61914f).dispose();
                return;
            case 1:
                ((rd.l) this.f61914f).invoke(th2);
                return;
            case 2:
                n1 n1Var = (n1) this.f61914f;
                n1Var.getClass();
                n1.f61918a.get(n1Var);
                throw null;
            default:
                f1 f1Var = (f1) this.f61914f;
                Object obj = n1.f61918a.get(h());
                if (obj instanceof v) {
                    f1Var.resumeWith(b7.h.a(((v) obj).f61939a));
                    return;
                } else {
                    f1Var.resumeWith(b0.w(obj));
                    return;
                }
        }
    }

    public m0(n1 n1Var) {
        this.f61913e = 2;
        this.f61914f = n1Var;
    }
}
