package org.telegram.ui;
public final class tn0 implements Runnable {
    public final int f40879a;
    public final long f40880b;

    public tn0(long j3, int i10) {
        this.f40879a = i10;
        this.f40880b = j3;
    }

    @Override
    public final void run() {
        switch (this.f40879a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(yn.Q9(this.f40880b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(yn.Q9(this.f40880b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(yn.Q9(this.f40880b));
                    return;
                }
                return;
        }
    }
}
