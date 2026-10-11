package org.telegram.ui;
public final class xb0 implements Runnable {
    public final int f44069a;
    public final dc0 f44070b;

    public xb0(dc0 dc0Var, int i10) {
        this.f44069a = i10;
        this.f44070b = dc0Var;
    }

    @Override
    public final void run() {
        switch (this.f44069a) {
            case 0:
                this.f44070b.b();
                return;
            default:
                this.f44070b.c();
                return;
        }
    }
}
