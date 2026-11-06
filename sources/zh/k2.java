package zh;
public final class k2 implements Runnable {
    public final int f60296a;
    public final m3 f60297b;

    public k2(m3 m3Var, int i7) {
        this.f60296a = i7;
        this.f60297b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f60296a) {
            case 0:
                d3 d3Var = this.f60297b.d;
                if (!d3Var.f60157l.isEmpty()) {
                    d3Var.f60157l.clear();
                    d3Var.h();
                    return;
                }
                return;
            case 1:
                d3 d3Var2 = this.f60297b.d;
                if (!d3Var2.f60156k.isEmpty()) {
                    d3Var2.f60156k.clear();
                    d3Var2.h();
                    return;
                }
                return;
            case 2:
                d3 d3Var3 = this.f60297b.d;
                if (!d3Var3.f60155j.isEmpty()) {
                    d3Var3.f60155j.clear();
                    d3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f60297b.d.i(c3.f60130a);
                return;
            case 4:
                this.f60297b.d.i(c3.f60131b);
                return;
            default:
                this.f60297b.d.i(c3.f60132c);
                return;
        }
    }
}
