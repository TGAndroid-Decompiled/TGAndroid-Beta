package ph;
public final class k3 implements Runnable {
    public final int f45170a;
    public final p3 f45171b;

    public k3(p3 p3Var, int i10) {
        this.f45170a = i10;
        this.f45171b = p3Var;
    }

    @Override
    public final void run() {
        switch (this.f45170a) {
            case 0:
                h3 h3Var = this.f45171b.f45271c;
                if (!h3Var.f45095j.isEmpty()) {
                    h3Var.f45095j.clear();
                    h3Var.h();
                    return;
                }
                return;
            case 1:
                h3 h3Var2 = this.f45171b.f45271c;
                if (!h3Var2.f45096k.isEmpty()) {
                    h3Var2.f45096k.clear();
                    h3Var2.h();
                    return;
                }
                return;
            case 2:
                h3 h3Var3 = this.f45171b.f45271c;
                if (!h3Var3.f45097l.isEmpty()) {
                    h3Var3.f45097l.clear();
                    h3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f45171b.f45271c.i(g3.f45067a);
                return;
            case 4:
                this.f45171b.f45271c.i(g3.f45068b);
                return;
            default:
                this.f45171b.f45271c.i(g3.f45069c);
                return;
        }
    }
}
