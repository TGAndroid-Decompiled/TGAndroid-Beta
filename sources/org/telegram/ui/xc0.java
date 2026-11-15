package org.telegram.ui;
public final class xc0 implements Runnable {
    public final int f53172a;
    public final ed0 f53173b;
    public final int f53174c;

    public xc0(ed0 ed0Var, int i7, int i10) {
        this.f53172a = i10;
        this.f53173b = ed0Var;
        this.f53174c = i7;
    }

    @Override
    public final void run() {
        switch (this.f53172a) {
            case 0:
                org.telegram.messenger.g0.h3(new xc0(this.f53173b, this.f53174c, 1));
                return;
            case 1:
                this.f53173b.z(this.f53174c);
                return;
            default:
                this.f53173b.f46740f.f45491f[this.f53174c].D(1.0f);
                return;
        }
    }
}
