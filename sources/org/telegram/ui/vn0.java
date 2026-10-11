package org.telegram.ui;
public final class vn0 implements Runnable {
    public final int f43127a;
    public final long f43128b;

    public vn0(long j3, int i10) {
        this.f43127a = i10;
        this.f43128b = j3;
    }

    @Override
    public final void run() {
        switch (this.f43127a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(zn.W9(this.f43128b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(zn.W9(this.f43128b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(zn.W9(this.f43128b));
                    return;
                }
                return;
        }
    }
}
