package org.telegram.ui;
public final class w70 implements Runnable {
    public final int f42398a;
    public final d80 f42399b;

    public w70(d80 d80Var, int i10) {
        this.f42398a = i10;
        this.f42399b = d80Var;
    }

    @Override
    public final void run() {
        switch (this.f42398a) {
            case 0:
                d80 d80Var = this.f42399b;
                d80Var.h.postOnAnimation(new w70(d80Var, 1));
                return;
            default:
                this.f42399b.Y();
                return;
        }
    }
}
