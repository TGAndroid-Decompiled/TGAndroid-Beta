package tg;
public final class u implements Runnable {
    public final int f55318a;
    public final w f55319b;
    public final j0 f55320c;

    public u(w wVar, j0 j0Var, int i3) {
        this.f55318a = i3;
        this.f55319b = wVar;
        this.f55320c = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f55318a) {
            case 0:
                org.telegram.messenger.g0.h3(new u(this.f55319b, this.f55320c, 1));
                return;
            default:
                w wVar = this.f55319b;
                wVar.getClass();
                wVar.f55345i = this.f55320c.f55216a;
                return;
        }
    }
}
