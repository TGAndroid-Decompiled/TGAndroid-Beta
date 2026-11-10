package zh;
public final class g3 implements Runnable {
    public final int f60357a;
    public final l3 f60358b;

    public g3(l3 l3Var, int i7) {
        this.f60357a = i7;
        this.f60358b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f60357a) {
            case 0:
                this.f60358b.d1();
                return;
            default:
                l3 l3Var = this.f60358b;
                l3Var.d2.O(true);
                org.telegram.messenger.g0.i3(new g3(l3Var, 0), 150L);
                return;
        }
    }
}
