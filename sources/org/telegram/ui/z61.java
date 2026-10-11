package org.telegram.ui;
public final class z61 implements Runnable {
    public final int f44629a;
    public final a71 f44630b;

    public z61(a71 a71Var, int i10) {
        this.f44629a = i10;
        this.f44630b = a71Var;
    }

    @Override
    public final void run() {
        switch (this.f44629a) {
            case 0:
                a71.a(this.f44630b);
                return;
            default:
                this.f44630b.dismiss();
                return;
        }
    }
}
