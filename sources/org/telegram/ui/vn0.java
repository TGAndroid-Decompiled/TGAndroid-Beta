package org.telegram.ui;
public final class vn0 implements Runnable {
    public final int f43093a;
    public final long f43094b;

    public vn0(long j3, int i10) {
        this.f43093a = i10;
        this.f43094b = j3;
    }

    @Override
    public final void run() {
        switch (this.f43093a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(zn.W9(this.f43094b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(zn.W9(this.f43094b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(zn.W9(this.f43094b));
                    return;
                }
                return;
        }
    }
}
