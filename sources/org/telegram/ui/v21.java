package org.telegram.ui;
public final class v21 implements Runnable {
    public final int f42895a;
    public final x21 f42896b;
    public final int f42897c;
    public final int d;

    public v21(x21 x21Var, int i10, int i11, int i12) {
        this.f42895a = i12;
        this.f42896b = x21Var;
        this.f42897c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f42895a) {
            case 0:
                this.f42896b.b(this.f42897c, this.d);
                return;
            case 1:
                this.f42896b.b(this.f42897c, this.d);
                return;
            default:
                this.f42896b.b(this.f42897c, this.d);
                return;
        }
    }
}
