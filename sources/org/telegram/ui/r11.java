package org.telegram.ui;

public final class r11 implements Runnable {

    public final int f41780a;

    public final t11 f41781b;

    public final int f41782c;
    public final int d;

    public r11(t11 t11Var, int i10, int i11, int i12) {
        this.f41780a = i12;
        this.f41781b = t11Var;
        this.f41782c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f41780a) {
            case 0:
                this.f41781b.b(this.f41782c, this.d);
                break;
            case 1:
                this.f41781b.b(this.f41782c, this.d);
                break;
            default:
                this.f41781b.b(this.f41782c, this.d);
                break;
        }
    }
}
