package tg;
public final class d0 implements Runnable {
    public final int f48378a;
    public final f0 f48379b;

    public d0(f0 f0Var, int i10) {
        this.f48378a = i10;
        this.f48379b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f48378a) {
            case 0:
                f0.f0(this.f48379b);
                return;
            default:
                f0.e0(this.f48379b);
                return;
        }
    }
}
