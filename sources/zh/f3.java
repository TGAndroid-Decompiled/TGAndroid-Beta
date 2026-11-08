package zh;
public final class f3 implements Runnable {
    public final int f60321a;
    public final k3 f60322b;

    public f3(k3 k3Var, int i7) {
        this.f60321a = i7;
        this.f60322b = k3Var;
    }

    @Override
    public final void run() {
        switch (this.f60321a) {
            case 0:
                this.f60322b.d1();
                return;
            default:
                k3 k3Var = this.f60322b;
                k3Var.f60418a2.O(true);
                org.telegram.messenger.g0.i3(new f3(k3Var, 0), 150L);
                return;
        }
    }
}
