package org.telegram.ui;
public final class y21 implements Runnable {
    public final int f39775a;
    public final a31 f39776b;
    public final int f39777c;
    public final int d;

    public y21(a31 a31Var, int i10, int i11, int i12) {
        this.f39775a = i12;
        this.f39776b = a31Var;
        this.f39777c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f39775a) {
            case 0:
                this.f39776b.b(this.f39777c, this.d);
                return;
            case 1:
                this.f39776b.b(this.f39777c, this.d);
                return;
            default:
                this.f39776b.b(this.f39777c, this.d);
                return;
        }
    }
}
