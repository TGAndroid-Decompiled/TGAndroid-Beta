package yh;
public final class l5 implements Runnable {
    public final int f53071a;
    public final m5 f53072b;
    public final long f53073c;

    public l5(m5 m5Var, long j3, int i10) {
        this.f53071a = i10;
        this.f53072b = m5Var;
        this.f53073c = j3;
    }

    @Override
    public final void run() {
        switch (this.f53071a) {
            case 0:
                m5 m5Var = this.f53072b;
                m5Var.f53118q.d0(m5Var.f53105b, m5Var.f53106c, this.f53073c, true, true, m5Var.f53115n);
                return;
            default:
                m5 m5Var2 = this.f53072b;
                m5Var2.f53118q.d0(m5Var2.f53105b, m5Var2.f53106c, this.f53073c, true, true, m5Var2.f53115n);
                return;
        }
    }
}
