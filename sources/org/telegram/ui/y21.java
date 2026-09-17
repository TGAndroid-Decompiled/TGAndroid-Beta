package org.telegram.ui;
public final class y21 implements Runnable {
    public final int f42968a;
    public final a31 f42969b;
    public final int f42970c;
    public final int d;

    public y21(a31 a31Var, int i10, int i11, int i12) {
        this.f42968a = i12;
        this.f42969b = a31Var;
        this.f42970c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f42968a) {
            case 0:
                this.f42969b.b(this.f42970c, this.d);
                return;
            case 1:
                this.f42969b.b(this.f42970c, this.d);
                return;
            default:
                this.f42969b.b(this.f42970c, this.d);
                return;
        }
    }
}
