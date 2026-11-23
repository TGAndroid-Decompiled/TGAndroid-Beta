package org.telegram.ui;
public final class xc0 implements Runnable {
    public final int f53912a;
    public final gd0 f53913b;
    public final int f53914c;

    public xc0(gd0 gd0Var, int i7, int i10) {
        this.f53912a = i10;
        this.f53913b = gd0Var;
        this.f53914c = i7;
    }

    @Override
    public final void run() {
        switch (this.f53912a) {
            case 0:
                org.telegram.messenger.g0.g3(new xc0(this.f53913b, this.f53914c, 1));
                return;
            case 1:
                this.f53913b.z(this.f53914c);
                return;
            default:
                this.f53913b.f48256f.f46491f[this.f53914c].D(1.0f);
                return;
        }
    }
}
