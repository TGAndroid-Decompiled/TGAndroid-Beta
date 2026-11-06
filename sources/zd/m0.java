package zd;
public final class m0 extends e1 {
    public final int f59971e;
    public final Object f59972f;

    public m0(Object obj, int i7) {
        this.f59971e = i7;
        this.f59972f = obj;
    }

    @Override
    public final boolean i() {
        switch (this.f59971e) {
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
        switch (this.f59971e) {
            case 0:
                ((l0) this.f59972f).dispose();
                return;
            case 1:
                ((rd.l) this.f59972f).invoke(th2);
                return;
            case 2:
                n1 n1Var = (n1) this.f59972f;
                n1Var.getClass();
                n1.f59976a.get(n1Var);
                throw null;
            default:
                f1 f1Var = (f1) this.f59972f;
                Object obj = n1.f59976a.get(h());
                if (obj instanceof v) {
                    f1Var.resumeWith(af.b.b(((v) obj).f59997a));
                    return;
                } else {
                    f1Var.resumeWith(b0.w(obj));
                    return;
                }
        }
    }

    public m0(n1 n1Var) {
        this.f59971e = 2;
        this.f59972f = n1Var;
    }
}
