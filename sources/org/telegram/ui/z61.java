package org.telegram.ui;
public final class z61 implements Runnable {
    public final int f44595a;
    public final a71 f44596b;

    public z61(a71 a71Var, int i10) {
        this.f44595a = i10;
        this.f44596b = a71Var;
    }

    @Override
    public final void run() {
        switch (this.f44595a) {
            case 0:
                a71.a(this.f44596b);
                return;
            default:
                this.f44596b.dismiss();
                return;
        }
    }
}
