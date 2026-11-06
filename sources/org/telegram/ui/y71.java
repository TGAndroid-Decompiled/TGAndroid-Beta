package org.telegram.ui;
public final class y71 implements Runnable {
    public final int f52164a;
    public final f81 f52165b;

    public y71(f81 f81Var, int i7) {
        this.f52164a = i7;
        this.f52165b = f81Var;
    }

    @Override
    public final void run() {
        switch (this.f52164a) {
            case 0:
                this.f52165b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f52165b.c(false);
                return;
        }
    }
}
