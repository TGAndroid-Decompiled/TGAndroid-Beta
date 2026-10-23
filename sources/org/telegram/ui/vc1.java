package org.telegram.ui;
public final class vc1 implements Runnable {
    public final int f42731a;
    public final ed1 f42732b;

    public vc1(ed1 ed1Var, int i10) {
        this.f42731a = i10;
        this.f42732b = ed1Var;
    }

    @Override
    public final void run() {
        switch (this.f42731a) {
            case 0:
                this.f42732b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f42732b.c(false);
                return;
        }
    }
}
