package org.telegram.ui;
public final class w21 implements Runnable {
    public final int f38764a;
    public final y21 f38765b;
    public final int f38766c;
    public final int d;

    public w21(y21 y21Var, int i10, int i11, int i12) {
        this.f38764a = i12;
        this.f38765b = y21Var;
        this.f38766c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f38764a) {
            case 0:
                this.f38765b.b(this.f38766c, this.d);
                return;
            case 1:
                this.f38765b.b(this.f38766c, this.d);
                return;
            default:
                this.f38765b.b(this.f38766c, this.d);
                return;
        }
    }
}
