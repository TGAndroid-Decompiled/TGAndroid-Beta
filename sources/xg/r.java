package xg;
public final class r implements Runnable {
    public final int f58752a;
    public final v f58753b;

    public r(v vVar, int i3) {
        this.f58752a = i3;
        this.f58753b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f58752a) {
            case 0:
                org.telegram.messenger.g0.h3(new r(this.f58753b, 1));
                return;
            default:
                this.f58753b.a(null);
                return;
        }
    }
}
