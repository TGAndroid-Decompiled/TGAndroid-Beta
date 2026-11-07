package zh;
public final class h3 implements Runnable {
    public final int f60265a;
    public final l3 f60266b;

    public h3(l3 l3Var, int i7) {
        this.f60265a = i7;
        this.f60266b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f60265a) {
            case 0:
                this.f60266b.d1();
                return;
            default:
                l3 l3Var = this.f60266b;
                l3Var.f60345a2.O(true);
                org.telegram.messenger.g0.i3(new h3(l3Var, 0), 150L);
                return;
        }
    }
}
