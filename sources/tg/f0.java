package tg;
public final class f0 implements Runnable {
    public final int f43138a;
    public final h0 f43139b;

    public f0(h0 h0Var, int i10) {
        this.f43138a = i10;
        this.f43139b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f43138a) {
            case 0:
                h0.e0(this.f43139b);
                return;
            default:
                h0.d0(this.f43139b);
                return;
        }
    }
}
