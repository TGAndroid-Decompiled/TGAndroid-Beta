package wg;
public final class p implements Runnable {
    public final int f59804a;
    public final v f59805b;

    public p(v vVar, int i7) {
        this.f59804a = i7;
        this.f59805b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f59804a) {
            case 0:
                org.telegram.messenger.g0.g3(new p(this.f59805b, 1));
                return;
            default:
                this.f59805b.a(null);
                return;
        }
    }
}
