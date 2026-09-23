package org.telegram.ui;
public final class rn0 implements Runnable {
    public final int f36899a;
    public final long f36900b;

    public rn0(long j3, int i10) {
        this.f36899a = i10;
        this.f36900b = j3;
    }

    @Override
    public final void run() {
        switch (this.f36899a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(xn.R9(this.f36900b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(xn.R9(this.f36900b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(xn.R9(this.f36900b));
                    return;
                }
                return;
        }
    }
}
