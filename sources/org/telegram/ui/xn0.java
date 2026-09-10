package org.telegram.ui;
public final class xn0 implements Runnable {
    public final int f38782a;
    public final long f38783b;

    public xn0(long j3, int i10) {
        this.f38782a = i10;
        this.f38783b = j3;
    }

    @Override
    public final void run() {
        switch (this.f38782a) {
            case 0:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(eo.R9(this.f38783b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(eo.R9(this.f38783b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(eo.R9(this.f38783b));
                    return;
                }
                return;
        }
    }
}
