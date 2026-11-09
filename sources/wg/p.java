package wg;
public final class p implements Runnable {
    public final int f57790a;
    public final u f57791b;

    public p(u uVar, int i7) {
        this.f57790a = i7;
        this.f57791b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f57790a) {
            case 0:
                org.telegram.messenger.g0.h3(new p(this.f57791b, 1));
                return;
            default:
                this.f57791b.a(null);
                return;
        }
    }
}
