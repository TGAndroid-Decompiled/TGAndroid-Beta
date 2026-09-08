package org.telegram.ui;
public final class y21 implements Runnable {
    public final int f42994a;
    public final a31 f42995b;
    public final int f42996c;
    public final int d;

    public y21(a31 a31Var, int i10, int i11, int i12) {
        this.f42994a = i12;
        this.f42995b = a31Var;
        this.f42996c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f42994a) {
            case 0:
                this.f42995b.b(this.f42996c, this.d);
                return;
            case 1:
                this.f42995b.b(this.f42996c, this.d);
                return;
            default:
                this.f42995b.b(this.f42996c, this.d);
                return;
        }
    }
}
