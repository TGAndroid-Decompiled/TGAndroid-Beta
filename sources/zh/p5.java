package zh;
public final class p5 implements Runnable {
    public final int f52425a;
    public final r5 f52426b;
    public final long f52427c;

    public p5(r5 r5Var, long j3, int i10) {
        this.f52425a = i10;
        this.f52426b = r5Var;
        this.f52427c = j3;
    }

    @Override
    public final void run() {
        switch (this.f52425a) {
            case 0:
                r5 r5Var = this.f52426b;
                r5Var.f52527q.d0(r5Var.f52514b, r5Var.f52515c, this.f52427c, true, true, r5Var.f52524n);
                return;
            default:
                r5 r5Var2 = this.f52426b;
                r5Var2.f52527q.d0(r5Var2.f52514b, r5Var2.f52515c, this.f52427c, true, true, r5Var2.f52524n);
                return;
        }
    }
}
