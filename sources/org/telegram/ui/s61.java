package org.telegram.ui;
public final class s61 implements Runnable {
    public final int f40372a;
    public final t61 f40373b;

    public s61(t61 t61Var, int i10) {
        this.f40372a = i10;
        this.f40373b = t61Var;
    }

    @Override
    public final void run() {
        switch (this.f40372a) {
            case 0:
                t61.a(this.f40373b);
                return;
            default:
                this.f40373b.dismiss();
                return;
        }
    }
}
