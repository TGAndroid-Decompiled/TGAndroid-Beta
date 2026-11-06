package sg;

import a8.wa;
public final class g0 implements Runnable {
    public final int f54961a;
    public final j0 f54962b;
    public final wa f54963c;

    public g0(j0 j0Var, wa waVar, int i7) {
        this.f54961a = i7;
        this.f54962b = j0Var;
        this.f54963c = waVar;
    }

    @Override
    public final void run() {
        switch (this.f54961a) {
            case 0:
                this.f54962b.p(this.f54963c, true);
                return;
            default:
                j0 j0Var = this.f54962b;
                j0Var.f54997f.f(new g0(j0Var, this.f54963c, 0));
                return;
        }
    }
}
