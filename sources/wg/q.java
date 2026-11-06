package wg;
public final class q implements Runnable {
    public final int f57705a;
    public final v f57706b;

    public q(v vVar, int i7) {
        this.f57705a = i7;
        this.f57706b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f57705a) {
            case 0:
                org.telegram.messenger.g0.h3(new q(this.f57706b, 1));
                return;
            default:
                this.f57706b.a(null);
                return;
        }
    }
}
