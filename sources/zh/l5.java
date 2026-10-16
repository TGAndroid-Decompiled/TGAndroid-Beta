package zh;
public final class l5 implements Runnable {
    public final int f50803a;
    public final m5 f50804b;
    public final long f50805c;

    public l5(m5 m5Var, long j10, int i10) {
        this.f50803a = i10;
        this.f50804b = m5Var;
        this.f50805c = j10;
    }

    @Override
    public final void run() {
        switch (this.f50803a) {
            case 0:
                m5 m5Var = this.f50804b;
                m5Var.f50837q.d0(m5Var.f50825b, m5Var.f50826c, this.f50805c, true, true, m5Var.f50834n);
                return;
            default:
                m5 m5Var2 = this.f50804b;
                m5Var2.f50837q.d0(m5Var2.f50825b, m5Var2.f50826c, this.f50805c, true, true, m5Var2.f50834n);
                return;
        }
    }
}
