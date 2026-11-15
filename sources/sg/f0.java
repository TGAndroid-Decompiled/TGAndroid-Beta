package sg;

import a8.xa;
public final class f0 implements Runnable {
    public final int f56615a;
    public final i0 f56616b;
    public final xa f56617c;

    public f0(i0 i0Var, xa xaVar, int i7) {
        this.f56615a = i7;
        this.f56616b = i0Var;
        this.f56617c = xaVar;
    }

    @Override
    public final void run() {
        switch (this.f56615a) {
            case 0:
                this.f56616b.p(this.f56617c, true);
                return;
            default:
                i0 i0Var = this.f56616b;
                i0Var.f56651f.f(new f0(i0Var, this.f56617c, 0));
                return;
        }
    }
}
