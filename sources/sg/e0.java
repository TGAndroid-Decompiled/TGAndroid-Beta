package sg;
public final class e0 implements Runnable {
    public final int f41913a;
    public final h0 f41914b;

    public e0(h0 h0Var, int i10) {
        this.f41913a = i10;
        this.f41914b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f41913a) {
            case 0:
                h0.e0(this.f41914b);
                return;
            default:
                h0.d0(this.f41914b);
                return;
        }
    }
}
