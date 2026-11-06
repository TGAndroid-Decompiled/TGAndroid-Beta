package org.telegram.ui;
public final class y71 implements Runnable {
    public final int f52143a;
    public final f81 f52144b;

    public y71(f81 f81Var, int i7) {
        this.f52143a = i7;
        this.f52144b = f81Var;
    }

    @Override
    public final void run() {
        switch (this.f52143a) {
            case 0:
                this.f52144b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f52144b.c(false);
                return;
        }
    }
}
