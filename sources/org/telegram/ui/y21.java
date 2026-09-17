package org.telegram.ui;
public final class y21 implements Runnable {
    public final int f42995a;
    public final a31 f42996b;
    public final int f42997c;
    public final int d;

    public y21(a31 a31Var, int i10, int i11, int i12) {
        this.f42995a = i12;
        this.f42996b = a31Var;
        this.f42997c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f42995a) {
            case 0:
                this.f42996b.b(this.f42997c, this.d);
                return;
            case 1:
                this.f42996b.b(this.f42997c, this.d);
                return;
            default:
                this.f42996b.b(this.f42997c, this.d);
                return;
        }
    }
}
