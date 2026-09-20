package org.telegram.ui;
public final class z61 implements Runnable {
    public final int f40128a;
    public final a71 f40129b;

    public z61(a71 a71Var, int i10) {
        this.f40128a = i10;
        this.f40129b = a71Var;
    }

    @Override
    public final void run() {
        switch (this.f40128a) {
            case 0:
                a71.a(this.f40129b);
                return;
            default:
                this.f40129b.dismiss();
                return;
        }
    }
}
