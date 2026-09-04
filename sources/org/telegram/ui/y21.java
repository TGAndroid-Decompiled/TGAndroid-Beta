package org.telegram.ui;
public final class y21 implements Runnable {
    public final int f42967a;
    public final a31 f42968b;
    public final int f42969c;
    public final int d;

    public y21(a31 a31Var, int i10, int i11, int i12) {
        this.f42967a = i12;
        this.f42968b = a31Var;
        this.f42969c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f42967a) {
            case 0:
                this.f42968b.b(this.f42969c, this.d);
                return;
            case 1:
                this.f42968b.b(this.f42969c, this.d);
                return;
            default:
                this.f42968b.b(this.f42969c, this.d);
                return;
        }
    }
}
