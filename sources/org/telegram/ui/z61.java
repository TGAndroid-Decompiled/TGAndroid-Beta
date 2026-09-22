package org.telegram.ui;
public final class z61 implements Runnable {
    public final int f40150a;
    public final a71 f40151b;

    public z61(a71 a71Var, int i10) {
        this.f40150a = i10;
        this.f40151b = a71Var;
    }

    @Override
    public final void run() {
        switch (this.f40150a) {
            case 0:
                a71.a(this.f40151b);
                return;
            default:
                this.f40151b.dismiss();
                return;
        }
    }
}
