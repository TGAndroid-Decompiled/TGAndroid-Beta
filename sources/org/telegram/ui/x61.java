package org.telegram.ui;
public final class x61 implements Runnable {
    public final int f39513a;
    public final y61 f39514b;

    public x61(y61 y61Var, int i10) {
        this.f39513a = i10;
        this.f39514b = y61Var;
    }

    @Override
    public final void run() {
        switch (this.f39513a) {
            case 0:
                y61.a(this.f39514b);
                return;
            default:
                this.f39514b.dismiss();
                return;
        }
    }
}
