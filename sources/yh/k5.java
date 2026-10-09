package yh;
public final class k5 implements Runnable {
    public final int f52783a;
    public final l5 f52784b;
    public final long f52785c;

    public k5(l5 l5Var, long j3, int i10) {
        this.f52783a = i10;
        this.f52784b = l5Var;
        this.f52785c = j3;
    }

    @Override
    public final void run() {
        switch (this.f52783a) {
            case 0:
                l5 l5Var = this.f52784b;
                l5Var.f52847q.d0(l5Var.f52834b, l5Var.f52835c, this.f52785c, true, true, l5Var.f52844n);
                return;
            default:
                l5 l5Var2 = this.f52784b;
                l5Var2.f52847q.d0(l5Var2.f52834b, l5Var2.f52835c, this.f52785c, true, true, l5Var2.f52844n);
                return;
        }
    }
}
