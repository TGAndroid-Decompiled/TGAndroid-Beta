package wg;
public final class q implements Runnable {
    public final int f57797a;
    public final v f57798b;

    public q(v vVar, int i7) {
        this.f57797a = i7;
        this.f57798b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f57797a) {
            case 0:
                org.telegram.messenger.g0.h3(new q(this.f57798b, 1));
                return;
            default:
                this.f57798b.a(null);
                return;
        }
    }
}
