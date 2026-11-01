package ph;
public final class k3 implements Runnable {
    public final int f45181a;
    public final p3 f45182b;

    public k3(p3 p3Var, int i10) {
        this.f45181a = i10;
        this.f45182b = p3Var;
    }

    @Override
    public final void run() {
        switch (this.f45181a) {
            case 0:
                h3 h3Var = this.f45182b.f45282c;
                if (!h3Var.f45106j.isEmpty()) {
                    h3Var.f45106j.clear();
                    h3Var.h();
                    return;
                }
                return;
            case 1:
                h3 h3Var2 = this.f45182b.f45282c;
                if (!h3Var2.f45107k.isEmpty()) {
                    h3Var2.f45107k.clear();
                    h3Var2.h();
                    return;
                }
                return;
            case 2:
                h3 h3Var3 = this.f45182b.f45282c;
                if (!h3Var3.f45108l.isEmpty()) {
                    h3Var3.f45108l.clear();
                    h3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f45182b.f45282c.i(g3.f45078a);
                return;
            case 4:
                this.f45182b.f45282c.i(g3.f45079b);
                return;
            default:
                this.f45182b.f45282c.i(g3.f45080c);
                return;
        }
    }
}
