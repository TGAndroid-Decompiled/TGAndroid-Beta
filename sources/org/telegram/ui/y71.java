package org.telegram.ui;
public final class y71 implements Runnable {
    public final int f52162a;
    public final f81 f52163b;

    public y71(f81 f81Var, int i7) {
        this.f52162a = i7;
        this.f52163b = f81Var;
    }

    @Override
    public final void run() {
        switch (this.f52162a) {
            case 0:
                this.f52163b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f52163b.c(false);
                return;
        }
    }
}
