package org.telegram.ui;
public final class ti0 implements Runnable {
    public final int f42716a;
    public final zi0 f42717b;

    public ti0(zi0 zi0Var, int i10) {
        this.f42716a = i10;
        this.f42717b = zi0Var;
    }

    @Override
    public final void run() {
        switch (this.f42716a) {
            case 0:
                this.f42717b.dismiss();
                return;
            case 1:
                this.f42717b.U(true, false);
                return;
            default:
                this.f42717b.U(true, false);
                return;
        }
    }
}
