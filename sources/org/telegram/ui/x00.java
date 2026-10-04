package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f42671a;
    public final y00 f42672b;

    public x00(y00 y00Var, int i10) {
        this.f42671a = i10;
        this.f42672b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f42671a) {
            case 0:
                this.f42672b.d();
                return;
            case 1:
                this.f42672b.a();
                return;
            default:
                y00 y00Var = this.f42672b;
                y00Var.b(y00Var.f42987y);
                return;
        }
    }
}
