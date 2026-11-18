package sg;

import a8.xa;
public final class f0 implements Runnable {
    public final int f57189a;
    public final i0 f57190b;
    public final xa f57191c;

    public f0(i0 i0Var, xa xaVar, int i7) {
        this.f57189a = i7;
        this.f57190b = i0Var;
        this.f57191c = xaVar;
    }

    @Override
    public final void run() {
        switch (this.f57189a) {
            case 0:
                this.f57190b.p(this.f57191c, true);
                return;
            default:
                i0 i0Var = this.f57190b;
                i0Var.f57225f.f(new f0(i0Var, this.f57191c, 0));
                return;
        }
    }
}
