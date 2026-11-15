package org.telegram.ui;
public final class x71 implements Runnable {
    public final int f53121a;
    public final e81 f53122b;

    public x71(e81 e81Var, int i7) {
        this.f53121a = i7;
        this.f53122b = e81Var;
    }

    @Override
    public final void run() {
        switch (this.f53121a) {
            case 0:
                this.f53122b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f53122b.c(false);
                return;
        }
    }
}
