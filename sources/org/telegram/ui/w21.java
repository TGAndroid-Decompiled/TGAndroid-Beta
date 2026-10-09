package org.telegram.ui;
public final class w21 implements Runnable {
    public final int f43077a;
    public final y21 f43078b;
    public final int f43079c;
    public final int d;

    public w21(y21 y21Var, int i10, int i11, int i12) {
        this.f43077a = i12;
        this.f43078b = y21Var;
        this.f43079c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f43077a) {
            case 0:
                this.f43078b.b(this.f43079c, this.d);
                return;
            case 1:
                this.f43078b.b(this.f43079c, this.d);
                return;
            default:
                this.f43078b.b(this.f43079c, this.d);
                return;
        }
    }
}
