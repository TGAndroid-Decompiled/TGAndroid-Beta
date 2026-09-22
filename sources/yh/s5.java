package yh;
public final class s5 implements Runnable {
    public final int f47733a;
    public final t5 f47734b;
    public final long f47735c;

    public s5(t5 t5Var, long j3, int i10) {
        this.f47733a = i10;
        this.f47734b = t5Var;
        this.f47735c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47733a) {
            case 0:
                t5 t5Var = this.f47734b;
                t5Var.f47777q.d0(t5Var.f47765b, t5Var.f47766c, this.f47735c, true, true, t5Var.f47774n);
                return;
            default:
                t5 t5Var2 = this.f47734b;
                t5Var2.f47777q.d0(t5Var2.f47765b, t5Var2.f47766c, this.f47735c, true, true, t5Var2.f47774n);
                return;
        }
    }
}
