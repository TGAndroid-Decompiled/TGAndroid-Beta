package org.telegram.ui;
public final class x21 implements Runnable {
    public final int f39351a;
    public final z21 f39352b;
    public final int f39353c;
    public final int d;

    public x21(z21 z21Var, int i10, int i11, int i12) {
        this.f39351a = i12;
        this.f39352b = z21Var;
        this.f39353c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f39351a) {
            case 0:
                this.f39352b.b(this.f39353c, this.d);
                return;
            case 1:
                this.f39352b.b(this.f39353c, this.d);
                return;
            default:
                this.f39352b.b(this.f39353c, this.d);
                return;
        }
    }
}
