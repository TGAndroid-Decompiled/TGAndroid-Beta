package org.telegram.ui;
public final class w61 implements Runnable {
    public final int f38704a;
    public final x61 f38705b;

    public w61(x61 x61Var, int i10) {
        this.f38704a = i10;
        this.f38705b = x61Var;
    }

    @Override
    public final void run() {
        switch (this.f38704a) {
            case 0:
                x61.a(this.f38705b);
                return;
            default:
                this.f38705b.dismiss();
                return;
        }
    }
}
