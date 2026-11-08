package wg;
public final class q implements Runnable {
    public final int f57798a;
    public final v f57799b;

    public q(v vVar, int i7) {
        this.f57798a = i7;
        this.f57799b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f57798a) {
            case 0:
                org.telegram.messenger.g0.h3(new q(this.f57799b, 1));
                return;
            default:
                this.f57799b.a(null);
                return;
        }
    }
}
