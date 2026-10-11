package yh;
public final class l5 implements Runnable {
    public final int f52922a;
    public final m5 f52923b;
    public final long f52924c;

    public l5(m5 m5Var, long j3, int i10) {
        this.f52922a = i10;
        this.f52923b = m5Var;
        this.f52924c = j3;
    }

    @Override
    public final void run() {
        switch (this.f52922a) {
            case 0:
                m5 m5Var = this.f52923b;
                m5Var.f52969q.d0(m5Var.f52956b, m5Var.f52957c, this.f52924c, true, true, m5Var.f52966n);
                return;
            default:
                m5 m5Var2 = this.f52923b;
                m5Var2.f52969q.d0(m5Var2.f52956b, m5Var2.f52957c, this.f52924c, true, true, m5Var2.f52966n);
                return;
        }
    }
}
