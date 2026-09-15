package org.telegram.ui;
public final class w61 implements Runnable {
    public final int f38783a;
    public final x61 f38784b;

    public w61(x61 x61Var, int i10) {
        this.f38783a = i10;
        this.f38784b = x61Var;
    }

    @Override
    public final void run() {
        switch (this.f38783a) {
            case 0:
                x61.a(this.f38784b);
                return;
            default:
                this.f38784b.dismiss();
                return;
        }
    }
}
