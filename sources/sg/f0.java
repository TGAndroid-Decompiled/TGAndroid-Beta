package sg;

import a8.xa;
public final class f0 implements Runnable {
    public final int f57314a;
    public final h0 f57315b;
    public final xa f57316c;

    public f0(h0 h0Var, xa xaVar, int i7) {
        this.f57314a = i7;
        this.f57315b = h0Var;
        this.f57316c = xaVar;
    }

    @Override
    public final void run() {
        switch (this.f57314a) {
            case 0:
                this.f57315b.p(this.f57316c, true);
                return;
            default:
                h0 h0Var = this.f57315b;
                h0Var.f57343f.f(new f0(h0Var, this.f57316c, 0));
                return;
        }
    }
}
