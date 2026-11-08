package zh;
public final class f3 implements Runnable {
    public final int f60320a;
    public final k3 f60321b;

    public f3(k3 k3Var, int i7) {
        this.f60320a = i7;
        this.f60321b = k3Var;
    }

    @Override
    public final void run() {
        switch (this.f60320a) {
            case 0:
                this.f60321b.d1();
                return;
            default:
                k3 k3Var = this.f60321b;
                k3Var.f60417a2.O(true);
                org.telegram.messenger.g0.i3(new f3(k3Var, 0), 150L);
                return;
        }
    }
}
