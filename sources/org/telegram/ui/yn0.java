package org.telegram.ui;
public final class yn0 implements Runnable {
    public final int f43197a;
    public final long f43198b;

    public yn0(long j3, int i10) {
        this.f43197a = i10;
        this.f43198b = j3;
    }

    @Override
    public final void run() {
        switch (this.f43197a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(co.R9(this.f43198b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(co.R9(this.f43198b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(co.R9(this.f43198b));
                    return;
                }
                return;
        }
    }
}
