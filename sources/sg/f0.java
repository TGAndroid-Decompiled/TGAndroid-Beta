package sg;

import a8.xa;
public final class f0 implements Runnable {
    public final int f57234a;
    public final i0 f57235b;
    public final xa f57236c;

    public f0(i0 i0Var, xa xaVar, int i7) {
        this.f57234a = i7;
        this.f57235b = i0Var;
        this.f57236c = xaVar;
    }

    @Override
    public final void run() {
        switch (this.f57234a) {
            case 0:
                this.f57235b.p(this.f57236c, true);
                return;
            default:
                i0 i0Var = this.f57235b;
                i0Var.f57270f.f(new f0(i0Var, this.f57236c, 0));
                return;
        }
    }
}
