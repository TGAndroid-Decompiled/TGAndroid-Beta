package zh;
public final class h3 implements Runnable {
    public final int f60235a;
    public final l3 f60236b;

    public h3(l3 l3Var, int i7) {
        this.f60235a = i7;
        this.f60236b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f60235a) {
            case 0:
                this.f60236b.d1();
                return;
            default:
                l3 l3Var = this.f60236b;
                l3Var.f60315a2.O(true);
                org.telegram.messenger.g0.i3(new h3(l3Var, 0), 150L);
                return;
        }
    }
}
