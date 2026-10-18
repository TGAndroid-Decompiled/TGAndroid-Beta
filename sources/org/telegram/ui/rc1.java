package org.telegram.ui;
public final class rc1 implements Runnable {
    public final int f40691a;
    public final ad1 f40692b;

    public rc1(ad1 ad1Var, int i10) {
        this.f40691a = i10;
        this.f40692b = ad1Var;
    }

    @Override
    public final void run() {
        switch (this.f40691a) {
            case 0:
                this.f40692b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f40692b.c(false);
                return;
        }
    }
}
