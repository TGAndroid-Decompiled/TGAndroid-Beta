package org.telegram.ui;
public final class s61 implements Runnable {
    public final int f40377a;
    public final t61 f40378b;

    public s61(t61 t61Var, int i10) {
        this.f40377a = i10;
        this.f40378b = t61Var;
    }

    @Override
    public final void run() {
        switch (this.f40377a) {
            case 0:
                t61.a(this.f40378b);
                return;
            default:
                this.f40378b.dismiss();
                return;
        }
    }
}
