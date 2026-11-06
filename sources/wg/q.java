package wg;
public final class q implements Runnable {
    public final int f57706a;
    public final v f57707b;

    public q(v vVar, int i7) {
        this.f57706a = i7;
        this.f57707b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f57706a) {
            case 0:
                org.telegram.messenger.g0.h3(new q(this.f57707b, 1));
                return;
            default:
                this.f57707b.a(null);
                return;
        }
    }
}
