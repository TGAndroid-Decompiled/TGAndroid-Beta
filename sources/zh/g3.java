package zh;
public final class g3 implements Runnable {
    public final int f60244a;
    public final k3 f60245b;

    public g3(k3 k3Var, int i7) {
        this.f60244a = i7;
        this.f60245b = k3Var;
    }

    @Override
    public final void run() {
        switch (this.f60244a) {
            case 0:
                d3 d3Var = this.f60245b.f60330c;
                if (!d3Var.f60185j.isEmpty()) {
                    d3Var.f60185j.clear();
                    d3Var.h();
                    return;
                }
                return;
            case 1:
                d3 d3Var2 = this.f60245b.f60330c;
                if (!d3Var2.f60186k.isEmpty()) {
                    d3Var2.f60186k.clear();
                    d3Var2.h();
                    return;
                }
                return;
            case 2:
                d3 d3Var3 = this.f60245b.f60330c;
                if (!d3Var3.f60187l.isEmpty()) {
                    d3Var3.f60187l.clear();
                    d3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f60245b.f60330c.i(c3.f60160a);
                return;
            case 4:
                this.f60245b.f60330c.i(c3.f60161b);
                return;
            default:
                this.f60245b.f60330c.i(c3.f60162c);
                return;
        }
    }
}
