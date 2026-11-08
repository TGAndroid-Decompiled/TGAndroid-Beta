package zh;
public final class i2 implements Runnable {
    public final int f60391a;
    public final l3 f60392b;

    public i2(l3 l3Var, int i7) {
        this.f60391a = i7;
        this.f60392b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f60391a) {
            case 0:
                b3 b3Var = this.f60392b.d;
                if (!b3Var.f60243l.isEmpty()) {
                    b3Var.f60243l.clear();
                    b3Var.h();
                    return;
                }
                return;
            case 1:
                b3 b3Var2 = this.f60392b.d;
                if (!b3Var2.f60242k.isEmpty()) {
                    b3Var2.f60242k.clear();
                    b3Var2.h();
                    return;
                }
                return;
            case 2:
                b3 b3Var3 = this.f60392b.d;
                if (!b3Var3.f60241j.isEmpty()) {
                    b3Var3.f60241j.clear();
                    b3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f60392b.d.i(a3.f60205a);
                return;
            case 4:
                this.f60392b.d.i(a3.f60206b);
                return;
            default:
                this.f60392b.d.i(a3.f60207c);
                return;
        }
    }
}
