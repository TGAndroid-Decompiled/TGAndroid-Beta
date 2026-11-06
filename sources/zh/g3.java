package zh;
public final class g3 implements Runnable {
    public final int f60238a;
    public final k3 f60239b;

    public g3(k3 k3Var, int i7) {
        this.f60238a = i7;
        this.f60239b = k3Var;
    }

    @Override
    public final void run() {
        switch (this.f60238a) {
            case 0:
                d3 d3Var = this.f60239b.f60324c;
                if (!d3Var.f60179j.isEmpty()) {
                    d3Var.f60179j.clear();
                    d3Var.h();
                    return;
                }
                return;
            case 1:
                d3 d3Var2 = this.f60239b.f60324c;
                if (!d3Var2.f60180k.isEmpty()) {
                    d3Var2.f60180k.clear();
                    d3Var2.h();
                    return;
                }
                return;
            case 2:
                d3 d3Var3 = this.f60239b.f60324c;
                if (!d3Var3.f60181l.isEmpty()) {
                    d3Var3.f60181l.clear();
                    d3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f60239b.f60324c.i(c3.f60154a);
                return;
            case 4:
                this.f60239b.f60324c.i(c3.f60155b);
                return;
            default:
                this.f60239b.f60324c.i(c3.f60156c);
                return;
        }
    }
}
