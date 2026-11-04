package org.telegram.ui;
public final class w01 implements Runnable {
    public final int f50652a;
    public final x01 f50653b;

    public w01(x01 x01Var, int i3) {
        this.f50652a = i3;
        this.f50653b = x01Var;
    }

    @Override
    public final void run() {
        switch (this.f50652a) {
            case 0:
                x01.a(this.f50653b);
                return;
            default:
                this.f50653b.dismiss();
                return;
        }
    }
}
