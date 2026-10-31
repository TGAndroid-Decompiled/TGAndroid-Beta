package rh;
public final class b6 implements Runnable {
    public final int f46685a;
    public final c6 f46686b;
    public final long f46687c;

    public b6(c6 c6Var, long j10, int i10) {
        this.f46685a = i10;
        this.f46686b = c6Var;
        this.f46687c = j10;
    }

    @Override
    public final void run() {
        switch (this.f46685a) {
            case 0:
                c6 c6Var = this.f46686b;
                c6Var.f46729q.b0(c6Var.f46717b, c6Var.f46718c, this.f46687c, true, true, c6Var.f46726n);
                return;
            default:
                c6 c6Var2 = this.f46686b;
                c6Var2.f46729q.b0(c6Var2.f46717b, c6Var2.f46718c, this.f46687c, true, true, c6Var2.f46726n);
                return;
        }
    }
}
