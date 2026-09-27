package org.telegram.ui;
public final class sn0 implements Runnable {
    public final int f37501a;
    public final long f37502b;

    public sn0(long j3, int i10) {
        this.f37501a = i10;
        this.f37502b = j3;
    }

    @Override
    public final void run() {
        switch (this.f37501a) {
            case 0:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(xn.R9(this.f37502b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(xn.R9(this.f37502b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(xn.R9(this.f37502b));
                    return;
                }
                return;
        }
    }
}
