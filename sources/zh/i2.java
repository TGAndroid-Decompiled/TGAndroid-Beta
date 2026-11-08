package zh;
public final class i2 implements Runnable {
    public final int f60390a;
    public final l3 f60391b;

    public i2(l3 l3Var, int i7) {
        this.f60390a = i7;
        this.f60391b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f60390a) {
            case 0:
                b3 b3Var = this.f60391b.d;
                if (!b3Var.f60242l.isEmpty()) {
                    b3Var.f60242l.clear();
                    b3Var.h();
                    return;
                }
                return;
            case 1:
                b3 b3Var2 = this.f60391b.d;
                if (!b3Var2.f60241k.isEmpty()) {
                    b3Var2.f60241k.clear();
                    b3Var2.h();
                    return;
                }
                return;
            case 2:
                b3 b3Var3 = this.f60391b.d;
                if (!b3Var3.f60240j.isEmpty()) {
                    b3Var3.f60240j.clear();
                    b3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f60391b.d.i(a3.f60204a);
                return;
            case 4:
                this.f60391b.d.i(a3.f60205b);
                return;
            default:
                this.f60391b.d.i(a3.f60206c);
                return;
        }
    }
}
