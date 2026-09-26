package tg;
public final class e0 implements Runnable {
    public final int f43403a;
    public final g0 f43404b;

    public e0(g0 g0Var, int i10) {
        this.f43403a = i10;
        this.f43404b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f43403a) {
            case 0:
                g0.e0(this.f43404b);
                return;
            default:
                g0.d0(this.f43404b);
                return;
        }
    }
}
