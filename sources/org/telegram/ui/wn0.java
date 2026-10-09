package org.telegram.ui;
public final class wn0 implements Runnable {
    public final int f43717a;
    public final long f43718b;

    public wn0(long j3, int i10) {
        this.f43717a = i10;
        this.f43718b = j3;
    }

    @Override
    public final void run() {
        switch (this.f43717a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(zn.W9(this.f43718b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(zn.W9(this.f43718b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(zn.W9(this.f43718b));
                    return;
                }
                return;
        }
    }
}
