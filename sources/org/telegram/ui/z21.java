package org.telegram.ui;
public final class z21 implements Runnable {
    public final int f44606a;
    public final b31 f44607b;
    public final int f44608c;
    public final int d;

    public z21(b31 b31Var, int i10, int i11, int i12) {
        this.f44606a = i12;
        this.f44607b = b31Var;
        this.f44608c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f44606a) {
            case 0:
                this.f44607b.b(this.f44608c, this.d);
                return;
            case 1:
                this.f44607b.b(this.f44608c, this.d);
                return;
            default:
                this.f44607b.b(this.f44608c, this.d);
                return;
        }
    }
}
