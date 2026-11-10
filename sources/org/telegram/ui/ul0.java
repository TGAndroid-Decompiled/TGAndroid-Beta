package org.telegram.ui;
public final class ul0 implements Runnable {
    public final int f50518a;
    public final em0 f50519b;

    public ul0(em0 em0Var, int i7) {
        this.f50518a = i7;
        this.f50519b = em0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f50518a;
        em0 em0Var = this.f50519b;
        switch (i7) {
            case 0:
                if (em0Var.G) {
                    em0Var.f45383b.invalidate();
                    return;
                }
                return;
            case 1:
                em0Var.h();
                return;
            case 2:
                int i10 = em0.f45380q0;
                em0Var.h();
                return;
            default:
                int i11 = em0.f45380q0;
                em0Var.h();
                return;
        }
    }
}
