package org.telegram.ui;
public final class z21 implements Runnable {
    public final int f44601a;
    public final b31 f44602b;
    public final int f44603c;
    public final int d;

    public z21(b31 b31Var, int i10, int i11, int i12) {
        this.f44601a = i12;
        this.f44602b = b31Var;
        this.f44603c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f44601a) {
            case 0:
                this.f44602b.b(this.f44603c, this.d);
                return;
            case 1:
                this.f44602b.b(this.f44603c, this.d);
                return;
            default:
                this.f44602b.b(this.f44603c, this.d);
                return;
        }
    }
}
