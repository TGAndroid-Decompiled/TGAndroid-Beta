package wg;
public final class q implements Runnable {
    public final int f57681a;
    public final v f57682b;

    public q(v vVar, int i7) {
        this.f57681a = i7;
        this.f57682b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f57681a) {
            case 0:
                org.telegram.messenger.g0.h3(new q(this.f57682b, 1));
                return;
            default:
                this.f57682b.a(null);
                return;
        }
    }
}
