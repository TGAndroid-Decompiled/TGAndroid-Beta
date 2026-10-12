package org.telegram.ui;
public final class yn0 implements Runnable {
    public final int f44512a;
    public final long f44513b;

    public yn0(long j3, int i10) {
        this.f44512a = i10;
        this.f44513b = j3;
    }

    @Override
    public final void run() {
        switch (this.f44512a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(eo.W9(this.f44513b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(eo.W9(this.f44513b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(eo.W9(this.f44513b));
                    return;
                }
                return;
        }
    }
}
