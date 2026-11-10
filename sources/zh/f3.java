package zh;
public final class f3 implements Runnable {
    public final int f60332a;
    public final k3 f60333b;

    public f3(k3 k3Var, int i7) {
        this.f60332a = i7;
        this.f60333b = k3Var;
    }

    @Override
    public final void run() {
        switch (this.f60332a) {
            case 0:
                c3 c3Var = this.f60333b.f60430c;
                if (!c3Var.f60270j.isEmpty()) {
                    c3Var.f60270j.clear();
                    c3Var.h();
                    return;
                }
                return;
            case 1:
                c3 c3Var2 = this.f60333b.f60430c;
                if (!c3Var2.f60271k.isEmpty()) {
                    c3Var2.f60271k.clear();
                    c3Var2.h();
                    return;
                }
                return;
            case 2:
                c3 c3Var3 = this.f60333b.f60430c;
                if (!c3Var3.f60272l.isEmpty()) {
                    c3Var3.f60272l.clear();
                    c3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f60333b.f60430c.i(b3.f60227a);
                return;
            case 4:
                this.f60333b.f60430c.i(b3.f60228b);
                return;
            default:
                this.f60333b.f60430c.i(b3.f60229c);
                return;
        }
    }
}
