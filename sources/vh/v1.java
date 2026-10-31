package vh;
public final class v1 implements Runnable {
    public final int f52036a;
    public final z1 f52037b;
    public final m6 f52038c;

    public v1(z1 z1Var, m6 m6Var, int i10) {
        this.f52036a = i10;
        this.f52037b = z1Var;
        this.f52038c = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f52036a) {
            case 0:
                z1 z1Var = this.f52037b;
                z1Var.getClass();
                org.telegram.messenger.i0.h3(new v1(z1Var, this.f52038c, 1), 320L);
                return;
            default:
                z1 z1Var2 = this.f52037b;
                z1Var2.getClass();
                this.f52038c.a(new ph.h1(z1Var2, 22));
                return;
        }
    }
}
