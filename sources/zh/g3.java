package zh;
public final class g3 implements Runnable {
    public final int f60239a;
    public final k3 f60240b;

    public g3(k3 k3Var, int i7) {
        this.f60239a = i7;
        this.f60240b = k3Var;
    }

    @Override
    public final void run() {
        switch (this.f60239a) {
            case 0:
                d3 d3Var = this.f60240b.f60325c;
                if (!d3Var.f60180j.isEmpty()) {
                    d3Var.f60180j.clear();
                    d3Var.h();
                    return;
                }
                return;
            case 1:
                d3 d3Var2 = this.f60240b.f60325c;
                if (!d3Var2.f60181k.isEmpty()) {
                    d3Var2.f60181k.clear();
                    d3Var2.h();
                    return;
                }
                return;
            case 2:
                d3 d3Var3 = this.f60240b.f60325c;
                if (!d3Var3.f60182l.isEmpty()) {
                    d3Var3.f60182l.clear();
                    d3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f60240b.f60325c.i(c3.f60155a);
                return;
            case 4:
                this.f60240b.f60325c.i(c3.f60156b);
                return;
            default:
                this.f60240b.f60325c.i(c3.f60157c);
                return;
        }
    }
}
