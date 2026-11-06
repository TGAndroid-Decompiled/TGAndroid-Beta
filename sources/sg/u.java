package sg;
public final class u implements Runnable {
    public final int f55114a;
    public final w f55115b;
    public final k0 f55116c;

    public u(w wVar, k0 k0Var, int i7) {
        this.f55114a = i7;
        this.f55115b = wVar;
        this.f55116c = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f55114a) {
            case 0:
                org.telegram.messenger.g0.h3(new u(this.f55115b, this.f55116c, 1));
                return;
            default:
                w wVar = this.f55115b;
                wVar.getClass();
                wVar.f55139i = this.f55116c.f55022a;
                return;
        }
    }
}
