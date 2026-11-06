package zh;
public final class k2 implements Runnable {
    public final int f60320a;
    public final m3 f60321b;

    public k2(m3 m3Var, int i7) {
        this.f60320a = i7;
        this.f60321b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f60320a) {
            case 0:
                d3 d3Var = this.f60321b.d;
                if (!d3Var.f60181l.isEmpty()) {
                    d3Var.f60181l.clear();
                    d3Var.h();
                    return;
                }
                return;
            case 1:
                d3 d3Var2 = this.f60321b.d;
                if (!d3Var2.f60180k.isEmpty()) {
                    d3Var2.f60180k.clear();
                    d3Var2.h();
                    return;
                }
                return;
            case 2:
                d3 d3Var3 = this.f60321b.d;
                if (!d3Var3.f60179j.isEmpty()) {
                    d3Var3.f60179j.clear();
                    d3Var3.h();
                    return;
                }
                return;
            case 3:
                this.f60321b.d.i(c3.f60154a);
                return;
            case 4:
                this.f60321b.d.i(c3.f60155b);
                return;
            default:
                this.f60321b.d.i(c3.f60156c);
                return;
        }
    }
}
