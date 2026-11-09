package zh;
public final class g3 implements Runnable {
    public final int f60352a;
    public final l3 f60353b;

    public g3(l3 l3Var, int i7) {
        this.f60352a = i7;
        this.f60353b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f60352a) {
            case 0:
                this.f60353b.d1();
                return;
            default:
                l3 l3Var = this.f60353b;
                l3Var.f60457a2.O(true);
                org.telegram.messenger.g0.i3(new g3(l3Var, 0), 150L);
                return;
        }
    }
}
