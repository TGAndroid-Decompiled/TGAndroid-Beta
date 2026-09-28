package yh;
public final class q5 implements Runnable {
    public final int f47911a;
    public final r5 f47912b;
    public final long f47913c;

    public q5(r5 r5Var, long j3, int i10) {
        this.f47911a = i10;
        this.f47912b = r5Var;
        this.f47913c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47911a) {
            case 0:
                r5 r5Var = this.f47912b;
                r5Var.f47969q.d0(r5Var.f47957b, r5Var.f47958c, this.f47913c, true, true, r5Var.f47966n);
                return;
            default:
                r5 r5Var2 = this.f47912b;
                r5Var2.f47969q.d0(r5Var2.f47957b, r5Var2.f47958c, this.f47913c, true, true, r5Var2.f47966n);
                return;
        }
    }
}
