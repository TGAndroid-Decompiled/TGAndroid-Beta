package zh;
public final class f3 implements Runnable {
    public final int f60330a;
    public final k3 f60331b;

    public f3(k3 k3Var, int i7) {
        this.f60330a = i7;
        this.f60331b = k3Var;
    }

    @Override
    public final void run() {
        switch (this.f60330a) {
            case 0:
                c3 c3Var = this.f60331b.f60428c;
                if (!c3Var.f60268j.isEmpty()) {
                    c3Var.f60268j.clear();
                    c3Var.h();
                    return;
                }
                return;
            case 1:
                c3 c3Var2 = this.f60331b.f60428c;
                if (!c3Var2.f60269k.isEmpty()) {
                    c3Var2.f60269k.clear();
                    c3Var2.h();
                    return;
                }
                return;
            case 2:
                c3 c3Var3 = this.f60331b.f60428c;
                if (!c3Var3.f60270l.isEmpty()) {
                    c3Var3.f60270l.clear();
                    c3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f60331b.f60428c.i(b3.f60227a);
                return;
            case 4:
                this.f60331b.f60428c.i(b3.f60228b);
                return;
            default:
                this.f60331b.f60428c.i(b3.f60229c);
                return;
        }
    }
}
