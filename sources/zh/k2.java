package zh;
public final class k2 implements Runnable {
    public final int f60321a;
    public final m3 f60322b;

    public k2(m3 m3Var, int i7) {
        this.f60321a = i7;
        this.f60322b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f60321a) {
            case 0:
                d3 d3Var = this.f60322b.d;
                if (!d3Var.f60182l.isEmpty()) {
                    d3Var.f60182l.clear();
                    d3Var.h();
                    return;
                }
                return;
            case 1:
                d3 d3Var2 = this.f60322b.d;
                if (!d3Var2.f60181k.isEmpty()) {
                    d3Var2.f60181k.clear();
                    d3Var2.h();
                    return;
                }
                return;
            case 2:
                d3 d3Var3 = this.f60322b.d;
                if (!d3Var3.f60180j.isEmpty()) {
                    d3Var3.f60180j.clear();
                    d3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f60322b.d.i(c3.f60155a);
                return;
            case 4:
                this.f60322b.d.i(c3.f60156b);
                return;
            default:
                this.f60322b.d.i(c3.f60157c);
                return;
        }
    }
}
