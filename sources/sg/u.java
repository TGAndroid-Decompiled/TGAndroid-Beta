package sg;
public final class u implements Runnable {
    public final int f55115a;
    public final w f55116b;
    public final k0 f55117c;

    public u(w wVar, k0 k0Var, int i7) {
        this.f55115a = i7;
        this.f55116b = wVar;
        this.f55117c = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f55115a) {
            case 0:
                org.telegram.messenger.g0.h3(new u(this.f55116b, this.f55117c, 1));
                return;
            default:
                w wVar = this.f55116b;
                wVar.getClass();
                wVar.f55140i = this.f55117c.f55023a;
                return;
        }
    }
}
