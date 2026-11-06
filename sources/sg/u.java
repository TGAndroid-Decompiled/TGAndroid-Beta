package sg;
public final class u implements Runnable {
    public final int f55090a;
    public final w f55091b;
    public final k0 f55092c;

    public u(w wVar, k0 k0Var, int i7) {
        this.f55090a = i7;
        this.f55091b = wVar;
        this.f55092c = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f55090a) {
            case 0:
                org.telegram.messenger.g0.h3(new u(this.f55091b, this.f55092c, 1));
                return;
            default:
                w wVar = this.f55091b;
                wVar.getClass();
                wVar.f55115i = this.f55092c.f54998a;
                return;
        }
    }
}
