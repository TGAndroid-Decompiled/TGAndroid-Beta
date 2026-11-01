package rh;
public final class b6 implements Runnable {
    public final int f46699a;
    public final c6 f46700b;
    public final long f46701c;

    public b6(c6 c6Var, long j10, int i10) {
        this.f46699a = i10;
        this.f46700b = c6Var;
        this.f46701c = j10;
    }

    @Override
    public final void run() {
        switch (this.f46699a) {
            case 0:
                c6 c6Var = this.f46700b;
                c6Var.f46743q.b0(c6Var.f46731b, c6Var.f46732c, this.f46701c, true, true, c6Var.f46740n);
                return;
            default:
                c6 c6Var2 = this.f46700b;
                c6Var2.f46743q.b0(c6Var2.f46731b, c6Var2.f46732c, this.f46701c, true, true, c6Var2.f46740n);
                return;
        }
    }
}
