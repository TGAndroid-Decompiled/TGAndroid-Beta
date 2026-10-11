package org.telegram.ui;
public final class w00 implements Runnable {
    public final int f43197a;
    public final x00 f43198b;

    public w00(x00 x00Var, int i10) {
        this.f43197a = i10;
        this.f43198b = x00Var;
    }

    @Override
    public final void run() {
        switch (this.f43197a) {
            case 0:
                this.f43198b.d();
                return;
            case 1:
                this.f43198b.a();
                return;
            default:
                x00 x00Var = this.f43198b;
                x00Var.b(x00Var.f43948y);
                return;
        }
    }
}
