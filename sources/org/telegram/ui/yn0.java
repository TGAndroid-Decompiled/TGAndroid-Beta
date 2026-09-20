package org.telegram.ui;
public final class yn0 implements Runnable {
    public final int f39966a;
    public final long f39967b;

    public yn0(long j3, int i10) {
        this.f39966a = i10;
        this.f39967b = j3;
    }

    @Override
    public final void run() {
        switch (this.f39966a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(zn.R9(this.f39967b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(zn.R9(this.f39967b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(zn.R9(this.f39967b));
                    return;
                }
                return;
        }
    }
}
