package sg;
public final class u implements Runnable {
    public final int f55207a;
    public final w f55208b;
    public final k0 f55209c;

    public u(w wVar, k0 k0Var, int i7) {
        this.f55207a = i7;
        this.f55208b = wVar;
        this.f55209c = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f55207a) {
            case 0:
                org.telegram.messenger.g0.h3(new u(this.f55208b, this.f55209c, 1));
                return;
            default:
                w wVar = this.f55208b;
                wVar.getClass();
                wVar.f55232i = this.f55209c.f55115a;
                return;
        }
    }
}
