package zh;
public final class l2 implements Runnable {
    public final int f60459a;
    public final m3 f60460b;

    public l2(m3 m3Var, int i7) {
        this.f60459a = i7;
        this.f60460b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f60459a) {
            case 0:
                c3 c3Var = this.f60460b.d;
                if (!c3Var.f60270j.isEmpty()) {
                    c3Var.f60270j.clear();
                    c3Var.h();
                    return;
                }
                return;
            case 1:
                c3 c3Var2 = this.f60460b.d;
                if (!c3Var2.f60271k.isEmpty()) {
                    c3Var2.f60271k.clear();
                    c3Var2.h();
                    return;
                }
                return;
            case 2:
                this.f60460b.d.i(b3.f60227a);
                return;
            case 3:
                this.f60460b.d.i(b3.f60228b);
                return;
            case 4:
                this.f60460b.d.i(b3.f60229c);
                return;
            default:
                c3 c3Var3 = this.f60460b.d;
                if (!c3Var3.f60272l.isEmpty()) {
                    c3Var3.f60272l.clear();
                    c3Var3.h();
                    return;
                }
                return;
        }
    }
}
