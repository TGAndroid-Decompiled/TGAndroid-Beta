package org.telegram.ui;

public final class uc1 implements Runnable {

    public final int f43187a;

    public final dd1 f43188b;

    public uc1(dd1 dd1Var, int i10) {
        this.f43187a = i10;
        this.f43188b = dd1Var;
    }

    @Override
    public final void run() {
        switch (this.f43187a) {
            case 0:
                this.f43188b.c(false);
                break;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                this.f43188b.c(false);
                break;
        }
    }
}
