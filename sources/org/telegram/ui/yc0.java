package org.telegram.ui;
public final class yc0 implements Runnable {
    public final int f54157a;
    public final gd0 f54158b;
    public final int f54159c;

    public yc0(gd0 gd0Var, int i7, int i10) {
        this.f54157a = i10;
        this.f54158b = gd0Var;
        this.f54159c = i7;
    }

    @Override
    public final void run() {
        switch (this.f54157a) {
            case 0:
                org.telegram.messenger.g0.g3(new yc0(this.f54158b, this.f54159c, 1));
                return;
            case 1:
                this.f54158b.z(this.f54159c);
                return;
            default:
                this.f54158b.f48061f.f46297f[this.f54159c].D(1.0f);
                return;
        }
    }
}
