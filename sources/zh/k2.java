package zh;
public final class k2 implements Runnable {
    public final int f60326a;
    public final m3 f60327b;

    public k2(m3 m3Var, int i7) {
        this.f60326a = i7;
        this.f60327b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f60326a) {
            case 0:
                d3 d3Var = this.f60327b.d;
                if (!d3Var.f60187l.isEmpty()) {
                    d3Var.f60187l.clear();
                    d3Var.h();
                    return;
                }
                return;
            case 1:
                d3 d3Var2 = this.f60327b.d;
                if (!d3Var2.f60186k.isEmpty()) {
                    d3Var2.f60186k.clear();
                    d3Var2.h();
                    return;
                }
                return;
            case 2:
                d3 d3Var3 = this.f60327b.d;
                if (!d3Var3.f60185j.isEmpty()) {
                    d3Var3.f60185j.clear();
                    d3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f60327b.d.i(c3.f60160a);
                return;
            case 4:
                this.f60327b.d.i(c3.f60161b);
                return;
            default:
                this.f60327b.d.i(c3.f60162c);
                return;
        }
    }
}
