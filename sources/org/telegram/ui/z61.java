package org.telegram.ui;
public final class z61 implements Runnable {
    public final int f43352a;
    public final a71 f43353b;

    public z61(a71 a71Var, int i10) {
        this.f43352a = i10;
        this.f43353b = a71Var;
    }

    @Override
    public final void run() {
        switch (this.f43352a) {
            case 0:
                a71.a(this.f43353b);
                return;
            default:
                this.f43353b.dismiss();
                return;
        }
    }
}
