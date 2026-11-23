package wg;
public final class q implements Runnable {
    public final int f59920a;
    public final u f59921b;

    public q(u uVar, int i7) {
        this.f59920a = i7;
        this.f59921b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f59920a) {
            case 0:
                org.telegram.messenger.g0.g3(new q(this.f59921b, 1));
                return;
            default:
                this.f59921b.a(null);
                return;
        }
    }
}
