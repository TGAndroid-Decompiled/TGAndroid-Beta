package org.telegram.ui;
public final class x21 implements Runnable {
    public final int f39327a;
    public final z21 f39328b;
    public final int f39329c;
    public final int d;

    public x21(z21 z21Var, int i10, int i11, int i12) {
        this.f39327a = i12;
        this.f39328b = z21Var;
        this.f39329c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f39327a) {
            case 0:
                this.f39328b.b(this.f39329c, this.d);
                return;
            case 1:
                this.f39328b.b(this.f39329c, this.d);
                return;
            default:
                this.f39328b.b(this.f39329c, this.d);
                return;
        }
    }
}
