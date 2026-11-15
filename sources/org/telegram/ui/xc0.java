package org.telegram.ui;
public final class xc0 implements Runnable {
    public final int f53171a;
    public final ed0 f53172b;
    public final int f53173c;

    public xc0(ed0 ed0Var, int i7, int i10) {
        this.f53171a = i10;
        this.f53172b = ed0Var;
        this.f53173c = i7;
    }

    @Override
    public final void run() {
        switch (this.f53171a) {
            case 0:
                org.telegram.messenger.g0.h3(new xc0(this.f53172b, this.f53173c, 1));
                return;
            case 1:
                this.f53172b.z(this.f53173c);
                return;
            default:
                this.f53172b.f46730f.f45485f[this.f53173c].D(1.0f);
                return;
        }
    }
}
