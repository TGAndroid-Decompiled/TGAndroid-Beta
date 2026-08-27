package org.telegram.ui;

public final class wi0 implements Runnable {

    public final int f44131a;

    public final dj0 f44132b;

    public wi0(dj0 dj0Var, int i10) {
        this.f44131a = i10;
        this.f44132b = dj0Var;
    }

    @Override
    public final void run() {
        switch (this.f44131a) {
            case 0:
                this.f44132b.dismiss();
                break;
            case 1:
                this.f44132b.U(true, false);
                break;
            default:
                this.f44132b.U(true, false);
                break;
        }
    }
}
