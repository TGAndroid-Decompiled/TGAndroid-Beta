package wg;
public final class r implements Runnable {
    public final int f59860a;
    public final v f59861b;

    public r(v vVar, int i7) {
        this.f59860a = i7;
        this.f59861b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f59860a) {
            case 0:
                org.telegram.messenger.g0.g3(new r(this.f59861b, 1));
                return;
            default:
                this.f59861b.a(null);
                return;
        }
    }
}
