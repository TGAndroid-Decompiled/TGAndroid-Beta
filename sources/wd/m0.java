package wd;

import b8.ib;
public final class m0 extends e1 {
    public final int f57514e;
    public final Object f57515f;

    public m0(Object obj, int i3) {
        this.f57514e = i3;
        this.f57515f = obj;
    }

    @Override
    public final boolean i() {
        switch (this.f57514e) {
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
        switch (this.f57514e) {
            case 0:
                ((l0) this.f57515f).dispose();
                return;
            case 1:
                ((od.l) this.f57515f).invoke(th2);
                return;
            case 2:
                n1 n1Var = (n1) this.f57515f;
                n1Var.getClass();
                n1.f57519a.get(n1Var);
                throw null;
            default:
                f1 f1Var = (f1) this.f57515f;
                Object obj = n1.f57519a.get(h());
                if (obj instanceof v) {
                    f1Var.resumeWith(ib.a(((v) obj).f57540a));
                    return;
                } else {
                    f1Var.resumeWith(b0.w(obj));
                    return;
                }
        }
    }

    public m0(n1 n1Var) {
        this.f57514e = 2;
        this.f57515f = n1Var;
    }
}
