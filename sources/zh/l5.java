package zh;
public final class l5 implements Runnable {
    public final int f50802a;
    public final m5 f50803b;
    public final long f50804c;

    public l5(m5 m5Var, long j10, int i10) {
        this.f50802a = i10;
        this.f50803b = m5Var;
        this.f50804c = j10;
    }

    @Override
    public final void run() {
        switch (this.f50802a) {
            case 0:
                m5 m5Var = this.f50803b;
                m5Var.f50836q.d0(m5Var.f50824b, m5Var.f50825c, this.f50804c, true, true, m5Var.f50833n);
                return;
            default:
                m5 m5Var2 = this.f50803b;
                m5Var2.f50836q.d0(m5Var2.f50824b, m5Var2.f50825c, this.f50804c, true, true, m5Var2.f50833n);
                return;
        }
    }
}
