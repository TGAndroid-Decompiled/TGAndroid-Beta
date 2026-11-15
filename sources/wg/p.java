package wg;
public final class p implements Runnable {
    public final int f59224a;
    public final t f59225b;

    public p(t tVar, int i7) {
        this.f59224a = i7;
        this.f59225b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f59224a) {
            case 0:
                org.telegram.messenger.g0.h3(new p(this.f59225b, 1));
                return;
            default:
                this.f59225b.a(null);
                return;
        }
    }
}
