package org.telegram.ui;
public final class xb0 implements Runnable {
    public final int f44035a;
    public final dc0 f44036b;

    public xb0(dc0 dc0Var, int i10) {
        this.f44035a = i10;
        this.f44036b = dc0Var;
    }

    @Override
    public final void run() {
        switch (this.f44035a) {
            case 0:
                this.f44036b.b();
                return;
            default:
                this.f44036b.c();
                return;
        }
    }
}
