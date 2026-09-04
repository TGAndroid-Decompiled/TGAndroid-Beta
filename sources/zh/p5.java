package zh;
public final class p5 implements Runnable {
    public final int f52424a;
    public final r5 f52425b;
    public final long f52426c;

    public p5(r5 r5Var, long j3, int i10) {
        this.f52424a = i10;
        this.f52425b = r5Var;
        this.f52426c = j3;
    }

    @Override
    public final void run() {
        switch (this.f52424a) {
            case 0:
                r5 r5Var = this.f52425b;
                r5Var.f52526q.d0(r5Var.f52513b, r5Var.f52514c, this.f52426c, true, true, r5Var.f52523n);
                return;
            default:
                r5 r5Var2 = this.f52425b;
                r5Var2.f52526q.d0(r5Var2.f52513b, r5Var2.f52514c, this.f52426c, true, true, r5Var2.f52523n);
                return;
        }
    }
}
