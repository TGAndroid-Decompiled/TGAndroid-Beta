package org.telegram.ui;
public final class s61 implements Runnable {
    public final int f37316a;
    public final t61 f37317b;

    public s61(t61 t61Var, int i10) {
        this.f37316a = i10;
        this.f37317b = t61Var;
    }

    @Override
    public final void run() {
        switch (this.f37316a) {
            case 0:
                t61.a(this.f37317b);
                return;
            default:
                this.f37317b.dismiss();
                return;
        }
    }
}
