package wg;
public final class p implements Runnable {
    public final int f57788a;
    public final u f57789b;

    public p(u uVar, int i7) {
        this.f57788a = i7;
        this.f57789b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f57788a) {
            case 0:
                org.telegram.messenger.g0.h3(new p(this.f57789b, 1));
                return;
            default:
                this.f57789b.a(null);
                return;
        }
    }
}
