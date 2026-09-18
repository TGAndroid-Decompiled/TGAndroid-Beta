package org.telegram.ui;
public final class y21 implements Runnable {
    public final int f39780a;
    public final a31 f39781b;
    public final int f39782c;
    public final int d;

    public y21(a31 a31Var, int i10, int i11, int i12) {
        this.f39780a = i12;
        this.f39781b = a31Var;
        this.f39782c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f39780a) {
            case 0:
                this.f39781b.b(this.f39782c, this.d);
                return;
            case 1:
                this.f39781b.b(this.f39782c, this.d);
                return;
            default:
                this.f39781b.b(this.f39782c, this.d);
                return;
        }
    }
}
