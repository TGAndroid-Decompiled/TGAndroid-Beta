package org.telegram.ui;
public final class w00 implements Runnable {
    public final int f38746a;
    public final x00 f38747b;

    public w00(x00 x00Var, int i10) {
        this.f38746a = i10;
        this.f38747b = x00Var;
    }

    @Override
    public final void run() {
        switch (this.f38746a) {
            case 0:
                this.f38747b.d();
                return;
            case 1:
                this.f38747b.a();
                return;
            default:
                x00 x00Var = this.f38747b;
                x00Var.b(x00Var.f39488y);
                return;
        }
    }
}
