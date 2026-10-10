package org.telegram.ui;
public final class w21 implements Runnable {
    public final int f43121a;
    public final y21 f43122b;
    public final int f43123c;
    public final int d;

    public w21(y21 y21Var, int i10, int i11, int i12) {
        this.f43121a = i12;
        this.f43122b = y21Var;
        this.f43123c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f43121a) {
            case 0:
                this.f43122b.b(this.f43123c, this.d);
                return;
            case 1:
                this.f43122b.b(this.f43123c, this.d);
                return;
            default:
                this.f43122b.b(this.f43123c, this.d);
                return;
        }
    }
}
