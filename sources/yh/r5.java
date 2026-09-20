package yh;
public final class r5 implements Runnable {
    public final int f47998a;
    public final t5 f47999b;
    public final long f48000c;

    public r5(t5 t5Var, long j3, int i10) {
        this.f47998a = i10;
        this.f47999b = t5Var;
        this.f48000c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47998a) {
            case 0:
                t5 t5Var = this.f47999b;
                t5Var.f48082q.d0(t5Var.f48070b, t5Var.f48071c, this.f48000c, true, true, t5Var.f48079n);
                return;
            default:
                t5 t5Var2 = this.f47999b;
                t5Var2.f48082q.d0(t5Var2.f48070b, t5Var2.f48071c, this.f48000c, true, true, t5Var2.f48079n);
                return;
        }
    }
}
