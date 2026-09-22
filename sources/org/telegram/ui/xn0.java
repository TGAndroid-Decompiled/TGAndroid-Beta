package org.telegram.ui;
public final class xn0 implements Runnable {
    public final int f39658a;
    public final long f39659b;

    public xn0(long j3, int i10) {
        this.f39658a = i10;
        this.f39659b = j3;
    }

    @Override
    public final void run() {
        switch (this.f39658a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(bo.R9(this.f39659b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(bo.R9(this.f39659b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(bo.R9(this.f39659b));
                    return;
                }
                return;
        }
    }
}
