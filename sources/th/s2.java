package th;
public final class s2 implements Runnable {
    public final int f48730a;
    public final p3 f48731b;
    public final f2.u0 f48732c;

    public s2(p3 p3Var, f2.u0 u0Var, int i10) {
        this.f48730a = i10;
        this.f48731b = p3Var;
        this.f48732c = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f48730a) {
            case 0:
                this.f48731b.setItemAnimator(this.f48732c);
                return;
            default:
                this.f48731b.setItemAnimator(this.f48732c);
                return;
        }
    }
}
