package zh;
public final class e3 implements Runnable {
    public final int f60308a;
    public final j3 f60309b;

    public e3(j3 j3Var, int i7) {
        this.f60308a = i7;
        this.f60309b = j3Var;
    }

    @Override
    public final void run() {
        switch (this.f60308a) {
            case 0:
                b3 b3Var = this.f60309b.f60408c;
                if (!b3Var.f60241j.isEmpty()) {
                    b3Var.f60241j.clear();
                    b3Var.h();
                    return;
                }
                return;
            case 1:
                b3 b3Var2 = this.f60309b.f60408c;
                if (!b3Var2.f60242k.isEmpty()) {
                    b3Var2.f60242k.clear();
                    b3Var2.h();
                    return;
                }
                return;
            case 2:
                b3 b3Var3 = this.f60309b.f60408c;
                if (!b3Var3.f60243l.isEmpty()) {
                    b3Var3.f60243l.clear();
                    b3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f60309b.f60408c.i(a3.f60205a);
                return;
            case 4:
                this.f60309b.f60408c.i(a3.f60206b);
                return;
            default:
                this.f60309b.f60408c.i(a3.f60207c);
                return;
        }
    }
}
