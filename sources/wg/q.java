package wg;
public final class q implements Runnable {
    public final int f59822a;
    public final v f59823b;

    public q(v vVar, int i7) {
        this.f59822a = i7;
        this.f59823b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f59822a) {
            case 0:
                org.telegram.messenger.g0.g3(new q(this.f59823b, 1));
                return;
            default:
                this.f59823b.a(null);
                return;
        }
    }
}
