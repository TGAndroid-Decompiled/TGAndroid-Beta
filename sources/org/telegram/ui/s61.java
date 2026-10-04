package org.telegram.ui;
public final class s61 implements Runnable {
    public final int f40371a;
    public final t61 f40372b;

    public s61(t61 t61Var, int i10) {
        this.f40371a = i10;
        this.f40372b = t61Var;
    }

    @Override
    public final void run() {
        switch (this.f40371a) {
            case 0:
                t61.a(this.f40372b);
                return;
            default:
                this.f40372b.dismiss();
                return;
        }
    }
}
