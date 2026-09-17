package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f42552a;
    public final y00 f42553b;

    public x00(y00 y00Var, int i10) {
        this.f42552a = i10;
        this.f42553b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f42552a) {
            case 0:
                this.f42553b.d();
                return;
            case 1:
                this.f42553b.a();
                return;
            default:
                y00 y00Var = this.f42553b;
                y00Var.b(y00Var.f42964y);
                return;
        }
    }
}
