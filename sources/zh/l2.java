package zh;
public final class l2 implements Runnable {
    public final int f60454a;
    public final m3 f60455b;

    public l2(m3 m3Var, int i7) {
        this.f60454a = i7;
        this.f60455b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f60454a) {
            case 0:
                c3 c3Var = this.f60455b.d;
                if (!c3Var.f60268j.isEmpty()) {
                    c3Var.f60268j.clear();
                    c3Var.h();
                    return;
                }
                return;
            case 1:
                c3 c3Var2 = this.f60455b.d;
                if (!c3Var2.f60269k.isEmpty()) {
                    c3Var2.f60269k.clear();
                    c3Var2.h();
                    return;
                }
                return;
            case 2:
                this.f60455b.d.i(b3.f60227a);
                return;
            case 3:
                this.f60455b.d.i(b3.f60228b);
                return;
            case 4:
                this.f60455b.d.i(b3.f60229c);
                return;
            default:
                c3 c3Var3 = this.f60455b.d;
                if (!c3Var3.f60270l.isEmpty()) {
                    c3Var3.f60270l.clear();
                    c3Var3.h();
                    return;
                }
                return;
        }
    }
}
