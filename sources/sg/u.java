package sg;
public final class u implements Runnable {
    public final int f55206a;
    public final w f55207b;
    public final k0 f55208c;

    public u(w wVar, k0 k0Var, int i7) {
        this.f55206a = i7;
        this.f55207b = wVar;
        this.f55208c = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f55206a) {
            case 0:
                org.telegram.messenger.g0.h3(new u(this.f55207b, this.f55208c, 1));
                return;
            default:
                w wVar = this.f55207b;
                wVar.getClass();
                wVar.f55231i = this.f55208c.f55114a;
                return;
        }
    }
}
