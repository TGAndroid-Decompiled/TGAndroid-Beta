package ph;
public final class o2 implements Runnable {
    public final int f45268a;
    public final r3 f45269b;

    public o2(r3 r3Var, int i10) {
        this.f45268a = i10;
        this.f45269b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f45268a) {
            case 0:
                h3 h3Var = this.f45269b.d;
                if (!h3Var.f45108l.isEmpty()) {
                    h3Var.f45108l.clear();
                    h3Var.h();
                    return;
                }
                return;
            case 1:
                h3 h3Var2 = this.f45269b.d;
                if (!h3Var2.f45107k.isEmpty()) {
                    h3Var2.f45107k.clear();
                    h3Var2.h();
                    return;
                }
                return;
            case 2:
                h3 h3Var3 = this.f45269b.d;
                if (!h3Var3.f45106j.isEmpty()) {
                    h3Var3.f45106j.clear();
                    h3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f45269b.d.i(g3.f45078a);
                return;
            case 4:
                this.f45269b.d.i(g3.f45079b);
                return;
            default:
                this.f45269b.d.i(g3.f45080c);
                return;
        }
    }
}
