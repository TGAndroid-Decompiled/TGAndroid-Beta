package org.telegram.ui;
public final class x21 implements Runnable {
    public final int f39478a;
    public final z21 f39479b;
    public final int f39480c;
    public final int d;

    public x21(z21 z21Var, int i10, int i11, int i12) {
        this.f39478a = i12;
        this.f39479b = z21Var;
        this.f39480c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f39478a) {
            case 0:
                this.f39479b.b(this.f39480c, this.d);
                return;
            case 1:
                this.f39479b.b(this.f39480c, this.d);
                return;
            default:
                this.f39479b.b(this.f39480c, this.d);
                return;
        }
    }
}
