package org.telegram.ui;
public final class yn0 implements Runnable {
    public final int f43198a;
    public final long f43199b;

    public yn0(long j3, int i10) {
        this.f43198a = i10;
        this.f43199b = j3;
    }

    @Override
    public final void run() {
        switch (this.f43198a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(co.R9(this.f43199b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(co.R9(this.f43199b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(co.R9(this.f43199b));
                    return;
                }
                return;
        }
    }
}
