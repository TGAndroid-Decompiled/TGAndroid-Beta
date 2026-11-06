package zh;
public final class h3 implements Runnable {
    public final int f60259a;
    public final l3 f60260b;

    public h3(l3 l3Var, int i7) {
        this.f60259a = i7;
        this.f60260b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f60259a) {
            case 0:
                this.f60260b.d1();
                return;
            default:
                l3 l3Var = this.f60260b;
                l3Var.f60339a2.O(true);
                org.telegram.messenger.g0.i3(new h3(l3Var, 0), 150L);
                return;
        }
    }
}
