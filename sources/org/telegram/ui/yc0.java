package org.telegram.ui;
public final class yc0 implements Runnable {
    public final int f54112a;
    public final hd0 f54113b;
    public final int f54114c;

    public yc0(hd0 hd0Var, int i7, int i10) {
        this.f54112a = i10;
        this.f54113b = hd0Var;
        this.f54114c = i7;
    }

    @Override
    public final void run() {
        switch (this.f54112a) {
            case 0:
                org.telegram.messenger.g0.g3(new yc0(this.f54113b, this.f54114c, 1));
                return;
            case 1:
                this.f54113b.z(this.f54114c);
                return;
            default:
                this.f54113b.f48312f.f46274f[this.f54114c].D(1.0f);
                return;
        }
    }
}
