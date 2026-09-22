package tg;
public final class f0 implements Runnable {
    public final int f43134a;
    public final h0 f43135b;

    public f0(h0 h0Var, int i10) {
        this.f43134a = i10;
        this.f43135b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f43134a) {
            case 0:
                h0.e0(this.f43135b);
                return;
            default:
                h0.d0(this.f43135b);
                return;
        }
    }
}
