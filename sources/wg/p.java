package wg;
public final class p implements Runnable {
    public final int f59805a;
    public final v f59806b;

    public p(v vVar, int i7) {
        this.f59805a = i7;
        this.f59806b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f59805a) {
            case 0:
                org.telegram.messenger.g0.g3(new p(this.f59806b, 1));
                return;
            default:
                this.f59806b.a(null);
                return;
        }
    }
}
