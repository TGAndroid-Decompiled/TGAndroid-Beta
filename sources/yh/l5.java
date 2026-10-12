package yh;
public final class l5 implements Runnable {
    public final int f53059a;
    public final m5 f53060b;
    public final long f53061c;

    public l5(m5 m5Var, long j3, int i10) {
        this.f53059a = i10;
        this.f53060b = m5Var;
        this.f53061c = j3;
    }

    @Override
    public final void run() {
        switch (this.f53059a) {
            case 0:
                m5 m5Var = this.f53060b;
                m5Var.f53106q.d0(m5Var.f53093b, m5Var.f53094c, this.f53061c, true, true, m5Var.f53103n);
                return;
            default:
                m5 m5Var2 = this.f53060b;
                m5Var2.f53106q.d0(m5Var2.f53093b, m5Var2.f53094c, this.f53061c, true, true, m5Var2.f53103n);
                return;
        }
    }
}
