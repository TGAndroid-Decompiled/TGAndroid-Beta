package sg;

import a8.xa;
public final class f0 implements Runnable {
    public final int f57230a;
    public final i0 f57231b;
    public final xa f57232c;

    public f0(i0 i0Var, xa xaVar, int i7) {
        this.f57230a = i7;
        this.f57231b = i0Var;
        this.f57232c = xaVar;
    }

    @Override
    public final void run() {
        switch (this.f57230a) {
            case 0:
                this.f57231b.p(this.f57232c, true);
                return;
            default:
                i0 i0Var = this.f57231b;
                i0Var.f57266f.f(new f0(i0Var, this.f57232c, 0));
                return;
        }
    }
}
