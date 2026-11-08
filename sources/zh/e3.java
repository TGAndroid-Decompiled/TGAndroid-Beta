package zh;
public final class e3 implements Runnable {
    public final int f60307a;
    public final j3 f60308b;

    public e3(j3 j3Var, int i7) {
        this.f60307a = i7;
        this.f60308b = j3Var;
    }

    @Override
    public final void run() {
        switch (this.f60307a) {
            case 0:
                b3 b3Var = this.f60308b.f60407c;
                if (!b3Var.f60240j.isEmpty()) {
                    b3Var.f60240j.clear();
                    b3Var.h();
                    return;
                }
                return;
            case 1:
                b3 b3Var2 = this.f60308b.f60407c;
                if (!b3Var2.f60241k.isEmpty()) {
                    b3Var2.f60241k.clear();
                    b3Var2.h();
                    return;
                }
                return;
            case 2:
                b3 b3Var3 = this.f60308b.f60407c;
                if (!b3Var3.f60242l.isEmpty()) {
                    b3Var3.f60242l.clear();
                    b3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f60308b.f60407c.i(a3.f60204a);
                return;
            case 4:
                this.f60308b.f60407c.i(a3.f60205b);
                return;
            default:
                this.f60308b.f60407c.i(a3.f60206c);
                return;
        }
    }
}
