package org.telegram.ui;
public final class ui0 implements Runnable {
    public final int f43261a;
    public final bj0 f43262b;

    public ui0(bj0 bj0Var, int i9) {
        this.f43261a = i9;
        this.f43262b = bj0Var;
    }

    @Override
    public final void run() {
        switch (this.f43261a) {
            case 0:
                this.f43262b.dismiss();
                return;
            case 1:
                this.f43262b.T(true, false);
                return;
            default:
                this.f43262b.T(true, false);
                return;
        }
    }
}
