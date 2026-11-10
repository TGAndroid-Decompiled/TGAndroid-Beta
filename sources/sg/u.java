package sg;
public final class u implements Runnable {
    public final int f55225a;
    public final w f55226b;
    public final k0 f55227c;

    public u(w wVar, k0 k0Var, int i7) {
        this.f55225a = i7;
        this.f55226b = wVar;
        this.f55227c = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f55225a) {
            case 0:
                org.telegram.messenger.g0.h3(new u(this.f55226b, this.f55227c, 1));
                return;
            default:
                w wVar = this.f55226b;
                wVar.getClass();
                wVar.f55250i = this.f55227c.f55126a;
                return;
        }
    }
}
