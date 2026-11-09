package sg;
public final class u implements Runnable {
    public final int f55226a;
    public final w f55227b;
    public final k0 f55228c;

    public u(w wVar, k0 k0Var, int i7) {
        this.f55226a = i7;
        this.f55227b = wVar;
        this.f55228c = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f55226a) {
            case 0:
                org.telegram.messenger.g0.h3(new u(this.f55227b, this.f55228c, 1));
                return;
            default:
                w wVar = this.f55227b;
                wVar.getClass();
                wVar.f55251i = this.f55228c.f55127a;
                return;
        }
    }
}
