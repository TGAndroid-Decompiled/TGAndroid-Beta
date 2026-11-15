package org.telegram.ui;
public final class x71 implements Runnable {
    public final int f53120a;
    public final e81 f53121b;

    public x71(e81 e81Var, int i7) {
        this.f53120a = i7;
        this.f53121b = e81Var;
    }

    @Override
    public final void run() {
        switch (this.f53120a) {
            case 0:
                this.f53121b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f53121b.c(false);
                return;
        }
    }
}
