package wg;
public final class r implements Runnable {
    public final int f59856a;
    public final v f59857b;

    public r(v vVar, int i7) {
        this.f59856a = i7;
        this.f59857b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f59856a) {
            case 0:
                org.telegram.messenger.g0.g3(new r(this.f59857b, 1));
                return;
            default:
                this.f59857b.a(null);
                return;
        }
    }
}
