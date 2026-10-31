package ph;
public final class o2 implements Runnable {
    public final int f45257a;
    public final r3 f45258b;

    public o2(r3 r3Var, int i10) {
        this.f45257a = i10;
        this.f45258b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f45257a) {
            case 0:
                h3 h3Var = this.f45258b.d;
                if (!h3Var.f45097l.isEmpty()) {
                    h3Var.f45097l.clear();
                    h3Var.h();
                    return;
                }
                return;
            case 1:
                h3 h3Var2 = this.f45258b.d;
                if (!h3Var2.f45096k.isEmpty()) {
                    h3Var2.f45096k.clear();
                    h3Var2.h();
                    return;
                }
                return;
            case 2:
                h3 h3Var3 = this.f45258b.d;
                if (!h3Var3.f45095j.isEmpty()) {
                    h3Var3.f45095j.clear();
                    h3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f45258b.d.i(g3.f45067a);
                return;
            case 4:
                this.f45258b.d.i(g3.f45068b);
                return;
            default:
                this.f45258b.d.i(g3.f45069c);
                return;
        }
    }
}
