package org.telegram.ui;
public final class xc0 implements Runnable {
    public final int f53787a;
    public final gd0 f53788b;
    public final int f53789c;

    public xc0(gd0 gd0Var, int i7, int i10) {
        this.f53787a = i10;
        this.f53788b = gd0Var;
        this.f53789c = i7;
    }

    @Override
    public final void run() {
        switch (this.f53787a) {
            case 0:
                org.telegram.messenger.g0.g3(new xc0(this.f53788b, this.f53789c, 1));
                return;
            case 1:
                this.f53788b.z(this.f53789c);
                return;
            default:
                this.f53788b.f48061f.f46283f[this.f53789c].D(1.0f);
                return;
        }
    }
}
