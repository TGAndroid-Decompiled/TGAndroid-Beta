package org.telegram.ui;
public final class w21 implements Runnable {
    public final int f43075a;
    public final y21 f43076b;
    public final int f43077c;
    public final int d;

    public w21(y21 y21Var, int i10, int i11, int i12) {
        this.f43075a = i12;
        this.f43076b = y21Var;
        this.f43077c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f43075a) {
            case 0:
                this.f43076b.b(this.f43077c, this.d);
                return;
            case 1:
                this.f43076b.b(this.f43077c, this.d);
                return;
            default:
                this.f43076b.b(this.f43077c, this.d);
                return;
        }
    }
}
