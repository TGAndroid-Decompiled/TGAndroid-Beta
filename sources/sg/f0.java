package sg;

import a8.xa;
public final class f0 implements Runnable {
    public final int f57199a;
    public final i0 f57200b;
    public final xa f57201c;

    public f0(i0 i0Var, xa xaVar, int i7) {
        this.f57199a = i7;
        this.f57200b = i0Var;
        this.f57201c = xaVar;
    }

    @Override
    public final void run() {
        switch (this.f57199a) {
            case 0:
                this.f57200b.p(this.f57201c, true);
                return;
            default:
                i0 i0Var = this.f57200b;
                i0Var.f57235f.f(new f0(i0Var, this.f57201c, 0));
                return;
        }
    }
}
